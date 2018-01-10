package pl.waw.sgh.bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> Customer_list=new ArrayList<>();
    private List<Account> Account_list=new ArrayList<>();

    private Integer Last_Customer_ID=0;
    private Integer Last_Account_ID=0;

    private Double Balance;

    private Account FindAccountByID(Integer ID){
        for(Account TempAcc:Account_list){
            if(TempAcc.getAccount_ID().equals(ID)) {
                return TempAcc;
            }
        }
        return null;
    }



    public void Transfer(Integer FromAccID, Integer ToAccID, double Amount){
        Account FromAccount = FindAccountByID(FromAccID);
        Double Balance0 = FromAccount.getBalance().doubleValue();
        //exception handling - amount less or equal 0:
        if(Amount<=0){
            System.out.println("Amount has to be greater than 0! You wanted to transfer: " + Amount +" from account ID: " + FromAccID + "\nPlease provide amount greater than 0 to carry out the operation" );
        }
        //exception handling - amount greater than balance:
        else if (Amount >= Balance0){
            System.out.println("Insufficient funds. Amount has to be smaller than or equal to your balance! You wanted to transfer: " + Amount +" from account ID: " + FromAccID + "\nCurrent balance of account ID: "+ FromAccID + " is: " + Balance0 +"\nPlease provide correct amount to carry out the operation");
        }

        else {
            Account ToAccount = FindAccountByID(ToAccID);
            FromAccount.charge(Amount);
            ToAccount.deposit(Amount);
        }
    }
    public Customer CreateCustomer(String First_Name, String Last_Name, String Email){
        Customer Customer=new Customer(Last_Customer_ID++,First_Name,Last_Name,Email);
        Customer_list.add(Customer);
        return Customer;
    }

    private Account CreateAccount(Customer Customer, boolean isSavings){
        Account acc=(isSavings ? new SavingsAccount(Last_Account_ID++,0d,Customer):new DebitAccount(Last_Account_ID++,0d,Customer));
        Account_list.add(acc);
        return acc;
    }
    public Account CreateSavingsAccount(Customer Customer){
        return  CreateAccount(Customer, true);
    }
    public Account CreateDebitAccount(Customer Customer){
        return CreateAccount(Customer,false);
    }

    public List <Customer> getCustomer_list(){
        return Customer_list;
    }
    public void setCustomer_list(List<Customer> Customer_list){
        this.Customer_list=Customer_list;
    }

    public List<Account> getAccount_list() {
        return Account_list;
    }
    public void setAccount_list(List<Account> Account_list){
        this.Account_list=Account_list;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "customers=\n" + Customer_list +
                ",\n accounts=\n" + Account_list +
                '}';
    }
}

