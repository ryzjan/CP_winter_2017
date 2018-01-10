package pl.waw.sgh.bank;
import java.math.BigDecimal;

public class PlayWithBank {


    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = bank.CreateCustomer("Jan", "Kowalski", "jk@a.pl");
        Customer c2 = bank.CreateCustomer("Natalia", "Nowak", "nn@portal.com");

        Account acc1 = bank.CreateDebitAccount(c1);
        Account acc2 = bank.CreateSavingsAccount(c1);

        Account acc3 = bank.CreateDebitAccount(c2);
        Account acc4 = bank.CreateSavingsAccount(c2);

        System.out.println(bank);
        acc1.Deposit(10);
        acc2.Deposit(312);
        acc2.Charge(50);
        acc3.Deposit(105);

        bank.Transfer(1, 0, 40);
        acc1.Charge(500);
        System.out.println(bank);
    }
    }
