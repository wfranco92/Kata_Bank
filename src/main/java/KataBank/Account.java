package KataBank;


import java.util.ArrayList;

public class Account {
    protected ArrayList<Statement> statement = new ArrayList<Statement>();
    protected AccountAmount accountAmount = new AccountAmount();

    void deposit(int amount, String date) {
        accountAmount.addAmount(amount);
        statement.add(new Statement(amount, 0, accountAmount.amount(), date));
    }

    void withdraw(int amount, String date){
        accountAmount.substrateAmount(amount);
        statement.add(new Statement(0, amount, accountAmount.amount(), date));
    }

    void printStatement() {
        System.out.println("Date" + "\t\t" + "Credit" + "\t\t" + "Debit" + "\t\t" + "Balance");
        for (Statement value : statement) {
            System.out.println(value.accountDate() + "\t" + value.accountMovementCredit()
                    + "\t\t" + value.accountMovementDebit() + "\t\t" + value.accountAmount());
        }
    }

}
