package pl.waw.sgh.bank;
import java.math.BigDecimal;
public abstract class Account {
    private Integer Account_ID;
    private BigDecimal Balance;
    private Customer Customer;

    public Account(Integer Account_ID, BigDecimal Balance, Customer Customer){
        this.Account_ID=Account_ID;
        this.Balance=Balance;
        this.Customer=Customer;
    }
    public Account(Integer Account_ID, Double Balance, Customer Customer){
        this.Account_ID=Account_ID;
        this.Balance=new BigDecimal(Balance);
        this.Customer=Customer;
        this.Balance=this.Balance.setScale(2);

    }
    public void Deposit(double Amount){
        Balance=Balance.add(new BigDecimal(Amount));
    }
    public void Charge(double Amount){
        Balance=Balance.subtract(new BigDecimal(Amount));

    }

    public Integer getAccount_ID() {
        return Account_ID;
    }
    public void setAccount_ID(Integer Account_ID){
        this.Account_ID=Account_ID;
    }

    public BigDecimal getBalance() {
        return Balance;
    }
    public void setBalance(BigDecimal Balance){
        this.Balance=Balance;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public void charge(double Amount) {

        Balance = Balance.subtract(new BigDecimal(Amount));
    }
    public void deposit(double Amount) {

        Balance = Balance.add(new BigDecimal(Amount));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Account", "") +
                "{" +
                "ID=" + Account_ID +
                ", USD=" + Balance +
                ", cust=" + Customer.getCustomer_ID() +
                "}\n";
    }
}
