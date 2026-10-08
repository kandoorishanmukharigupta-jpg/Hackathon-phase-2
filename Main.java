 import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String name;
    double balance;

    BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, bal);

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter withdraw amount: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        acc.display();
        sc.close();
    }
}