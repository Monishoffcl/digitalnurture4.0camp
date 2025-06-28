BEGIN
    FOR record IN (
        SELECT customer_id, loan_interest_rate
        FROM customers
        WHERE age > 60
    ) LOOP
        UPDATE customers
        SET loan_interest_rate = loan_interest_rate * 0.99
        WHERE customer_id = record.customer_id;

        DBMS_OUTPUT.PUT_LINE('Updated customer ID: ' || record.customer_id || 
                             ' - New interest rate: ' || (record.loan_interest_rate * 0.99));
    END LOOP;

    COMMIT; 
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK; 
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;