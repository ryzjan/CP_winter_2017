package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(Integer Account_ID, BigDecimal Balance, Customer Customer) {
        super(Account_ID, Balance, Customer);
    }

    public DebitAccount(Integer Account_ID, Double Balance, Customer Customer) {
        super(Account_ID, Balance, Customer);
    }


}