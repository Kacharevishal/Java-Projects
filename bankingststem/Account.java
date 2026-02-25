package com.bankingststem;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    private String[] transactions = new String[100];
    private int transactionCount = 0;

    public Account(String accNo, String name, double initialDeposit) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialDeposit;
        addTransaction("Account created with balance: " + initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void addTransaction(String message) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = message;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: " + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            addTransaction("Withdrawn: " + amount);
            System.out.println("Withdrawal successful.");
        }
    }

    public void transfer(Account receiver, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            receiver.balance += amount;

            addTransaction("Transferred: " + amount + " to " + receiver.accountNumber);
            receiver.addTransaction("Received: " + amount + " from " + this.accountNumber);

            System.out.println("Transfer successful.");
        }
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }
}

