CREATE PROCEDURE ProcessMonthlyInterest AS
    v_interest_amount NUMBER(15,2);
    v_new_balance NUMBER(15,2);
BEGIN
    FOR record IN (
        SELECT AccountID, Balance, InterestRate
        FROM Account
        WHERE Status = 'ACTIVE' AND Balance > 0
    ) LOOP
        v_interest_amount := ROUND(record.Balance * record.InterestRate, 2);
        v_new_balance := record.Balance + v_interest_amount;

        UPDATE Account
        SET Balance = v_new_balance
        WHERE AccountID = record.AccountID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error processing monthly interest: ' || SQLERRM);
END ProcessMonthlyInterest;
/