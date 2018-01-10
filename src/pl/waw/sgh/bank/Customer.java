package pl.waw.sgh.bank;

public class Customer {
    private Integer customer_ID;
    private String first_name;
    private String last_name;
    private String email;

    public Customer(Integer customer_ID, String first_name, String last_name, String email){
        this.customer_ID=customer_ID;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;

    }



}
