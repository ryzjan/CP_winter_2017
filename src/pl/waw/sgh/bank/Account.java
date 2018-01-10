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
        //exception handling - amount less or equal 0:
        if(Amount<=0){
            System.out.println("Amount has to be greater than 0! You wanted to deposit: " + Amount +" on account ID: " + getAccount_ID() + "\nPlease provide amount greater than 0 to carry out the operation" );
            Balance=Balance.add(new BigDecimal(0));
        }
        else
        {Balance=Balance.add(new BigDecimal(Amount));}
    }
    public void Charge(double Amount){
        Double Balance1=getBalance().doubleValue();
        //exception handling - amount less or equal 0:
        if(Amount<=0){
            System.out.println("Amount has to be greater than 0! You wanted to charge: " + Amount +" on account ID: " + getAccount_ID() + "\nPlease provide amount greater than 0 to carry out the operation" );
        }

        //exception handling - amount greater than balance:

        else if (Amount >= Balance1){
            System.out.println("Insufficient funds. Amount has to be smaller than or equal to your balance! You wanted to charge: " + Amount +" on account ID: " + getAccount_ID() + "\nCurrent balance of account ID: "+ getAccount_ID() + " is: "+ getBalance() +"\nPlease provide correct amount to carry out the operation" );
        }
        else{
        Balance=Balance.subtract(new BigDecimal(Amount));}

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
