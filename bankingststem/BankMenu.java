package com.bankingststem;

import java.util.Scanner;

class BankMenu {

    private Bank bank = new Bank();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Transaction History");
            System.out.println("7. Delete Account");
            System.out.println("8. Show All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.next();
                    System.out.print("Enter Initial Deposit: ");
                    double dep = sc.nextDouble();
                    bank.createAccount(accNo, name, dep);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    Account acc = bank.findAccount(sc.next());
                    if (acc != null) {
                        System.out.print("Enter deposit amount: ");
                        acc.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    acc = bank.findAccount(sc.next());
                    if (acc != null) {
                        System.out.print("Enter withdrawal amount: ");
                        acc.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Sender Account: ");
                    Account sender = bank.findAccount(sc.next());
                    System.out.print("Enter Receiver Account: ");
                    Account receiver = bank.findAccount(sc.next());

                    if (sender != null && receiver != null) {
                        System.out.print("Enter transfer amount: ");
                        sender.transfer(receiver, sc.nextDouble());
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    acc = bank.findAccount(sc.next());
                    if (acc != null) {
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    acc = bank.findAccount(sc.next());
                    if (acc != null) {
                        acc.showTransactions();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Account Number: ");
                    bank.deleteAccount(sc.next());
                    break;

                case 8:
                    bank.showAllAccounts();
                    break;

                case 0:
                    System.out.println("Thank you for using Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}

