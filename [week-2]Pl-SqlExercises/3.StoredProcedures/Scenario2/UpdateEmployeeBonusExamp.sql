CREATE PROCEDURE UpdateEmployeeBonus(
    p_department_id NUMBER,
    p_bonus_percentage NUMBER
) AS
    v_bonus_amount NUMBER(15,2);
    v_new_salary NUMBER(15,2);
BEGIN
    FOR record IN (
        SELECT EmployeeID, Salary
        FROM Employee
        WHERE DepartmentID = p_department_id AND Status = 'ACTIVE'
    ) LOOP
        v_bonus_amount := ROUND(record.Salary * (p_bonus_percentage / 100), 2);
        v_new_salary := record.Salary + v_bonus_amount;

        UPDATE Employee
        SET Salary = v_new_salary
        WHERE EmployeeID = record.EmployeeID;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Employee bonuses updated successfully for department ID: ' || p_department_id);
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating employee bonuses: ' || SQLERRM);
END UpdateEmployeeBonus;
/