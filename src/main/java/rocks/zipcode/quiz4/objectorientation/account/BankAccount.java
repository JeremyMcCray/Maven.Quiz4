package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance = 0.;
    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy >= 0) {
            balance += amountToIncreaseBy;
        } else throw new IllegalArgumentException("must be over 0");
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy > 0 && amountToDecreaseBy <= this.balance) {
            balance -= amountToDecreaseBy;
        }else throw new IllegalArgumentException("must be over 0");
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
