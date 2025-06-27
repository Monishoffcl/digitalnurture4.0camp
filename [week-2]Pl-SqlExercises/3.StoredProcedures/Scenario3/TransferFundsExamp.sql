CREATE PROCEDURE TransferFunds(
    p_source_account_id NUMBER,
    p_target_account_id NUMBER,
    p_amount NUMBER
) AS
    v_source_balance NUMBER(15,2);
BEGIN
    SELECT Balance INTO v_source_balance
    FROM Account
    WHERE AccountID = p_source_account_id AND Status = 'ACTIVE';

    IF v_source_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
        RETURN;
    END IF;

    UPDATE Account
    SET Balance = Balance - p_amount
    WHERE AccountID = p_source_account_id;

    UPDATE Account
    SET Balance = Balance + p_amount
    WHERE AccountID = p_target_account_id AND Status = 'ACTIVE';

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful: $' || p_amount || ' transferred from account ' || p_source_account_id || ' to account ' || p_target_account_id);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('One of the accounts does not exist or is inactive.');
        ROLLBACK;
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error during fund transfer: ' || SQLERRM);
END TransferFunds;
/