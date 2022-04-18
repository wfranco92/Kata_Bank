package KataBank;

public class Statement {

    private final AccountMovement accountMovement = new AccountMovement();
    private final AccountAmount accountAmount = new AccountAmount();
    Statement(int credit, int debit, int balance, String date){

        this.accountAmount.amount = balance;
        this.accountAmount.dateMovementRegister = date;
        this.accountMovement.credit = String.valueOf(credit);
        this.accountMovement.debit = String.valueOf(debit);

        if(credit == 0){
            this.accountMovement.credit = "     ";
        }
        if(debit == 0){
            this.accountMovement.debit = "     ";
        }
    }

    public String accountMovementCredit() {
        return accountMovement.credit;
    }

    public int accountAmount() {
        return accountAmount.amount;
    }

    public String accountMovementDebit() {
        return accountMovement.debit;
    }

    public String accountDate() {
        return accountAmount.dateMovementRegister;
    }

}
