package KataBank;

public class AccountAmount {
    protected int amount;
    protected String dateMovementRegister;
    public AccountAmount() {
        amount = 0;
        dateMovementRegister = "";
    }

    public void addAmount(int amountOf){
        amount += amountOf;
    }

    public void substrateAmount(int amountOf){
        amount -= amountOf;
    }
    public int amount(){
        return amount;
    }
}
