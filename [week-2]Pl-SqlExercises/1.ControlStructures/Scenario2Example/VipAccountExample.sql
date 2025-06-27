BEGIN
    UPDATE customer_accounts
    SET is_vip = 1
    WHERE account_balance > 10000
    AND is_vip = 0; 

    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' customers promoted to VIP status.');

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END;
/