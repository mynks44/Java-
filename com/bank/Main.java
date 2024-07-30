package com.bank;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("12345", 1000.0);

        try {
            System.out.println("Initial Balance: " + account.getBalance());

            account.deposit(500.0);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(300.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(2000.0);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final Balance: " + account.getBalance());
        }

        try {
            account.deposit(-100.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final Balance after invalid deposit attempt: " + account.getBalance());
        }

        try {
            // Attempt to withdraw an invalid amount
            account.withdraw(-50.0);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final Balance after invalid withdrawal attempt: " + account.getBalance());
        }
    }
}
