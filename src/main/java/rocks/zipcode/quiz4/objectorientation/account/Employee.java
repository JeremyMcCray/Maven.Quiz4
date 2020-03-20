package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    BankAccount account;
    Double hoursWorked ;
    Double hourlyWage;
    public Employee() {
        this.account = new BankAccount();
        this.hoursWorked=0.;
        this.hourlyWage=35.;
    }

    public Employee(BankAccount bankAccount) {
        this.account=bankAccount;
        this.hourlyWage=35.;
        this.hoursWorked=0.;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
    this.account=bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.account.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.account.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.account.balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked+=numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hoursWorked*hourlyWage;
    }
}
