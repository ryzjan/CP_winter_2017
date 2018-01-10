package pl.waw.sgh.bank;
import java.math.BigDecimal;

public class SavingsAccount extends Account{
    public SavingsAccount (Integer Account_ID, BigDecimal Balance, Customer Customer){
        super(Account_ID, Balance, Customer);
    }


    public SavingsAccount(Integer Account_ID, Double Balance, Customer Customer){
        super(Account_ID, Balance, Customer);

    }

}
