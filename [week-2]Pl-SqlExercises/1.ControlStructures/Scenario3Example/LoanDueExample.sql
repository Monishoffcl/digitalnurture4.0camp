BEGIN
   FOR record IN (
        SELECT loan_id, customer_name, amount, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE+30
        AND status = 'ACTIVE'
        ORDER BY due_date
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder for ' || record.customer_name || 
            ' (Loan ID: ' || record.loan_id || '): ' ||
            'Pay $' || record.amount || 
            ' by ' || TO_CHAR(record.due_date, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/