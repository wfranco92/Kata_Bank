package KataBank;

public class StartApp {

    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(1500), date("14/01/2021"));

        account.printStatement();


    }

    static int amountOf(int x){
        return x;
    }

    static String date(String date){
        return date;
    }

}
