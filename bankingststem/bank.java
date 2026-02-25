package com.bankingststem;

class Bank {
    private Account[] accounts = new Account[100];
    private int accountCount = 0;

    public void createAccount(String accNo, String name, double deposit) {
        if (findAccount(accNo) != null) {
            System.out.println("Account already exists!");
            return;
        }

        accounts[accountCount++] = new Account(accNo, name, deposit);
        System.out.println("Account created successfully.");
    }

    public Account findAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void deleteAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accNo)) {

                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }

                accounts[accountCount - 1] = null;
                accountCount--;
                System.out.println("Account deleted successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void showAllAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return;
        }

        for (int i = 0; i < accountCount; i++) {
            accounts[i].showDetails();
            System.out.println("---------------------");
        }
    }
}
