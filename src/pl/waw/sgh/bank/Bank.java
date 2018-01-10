package pl.waw.sgh.bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> Customer_list=new ArrayList<>();
    private List<Account> Account_list=new ArrayList<>();

    private Integer Last_Customer_ID=0;
    private Integer Last_Account_ID=0;

    private Account FindAccountByID(Integer ID){
        for(Account TempAcc:Account_list){
            if(TempAcc.getAccount_ID().equals(ID)) {
                return TempAcc;
            }


        }
        return null;
    }


}
