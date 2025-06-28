package com.settingupjunit;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
         Assert.assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
          BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(50.0);
        Assert.assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
          BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(150.0); 
        Assert.assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(-50.0); 
        Assert.assertEquals(0.0, account.getBalance(), 0.01);
    }

 
}
