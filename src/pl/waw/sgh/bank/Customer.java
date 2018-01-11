package pl.waw.sgh.bank;

public class Customer {
    private Integer Customer_ID;
    private String First_name;
    private String Last_name;
    private String Email;

    public Customer(Integer Customer_ID, String First_name, String Last_name, String Email){
        this.Customer_ID=Customer_ID;
        this.First_name=First_name;
        this.Last_name=Last_name;
        this.Email=Email;

    }
    public Integer getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(Integer Customer_ID) {
        this.Customer_ID = Customer_ID;
    }
    public String getFirst_name() {
        return First_name;
    }
    public void setFirst_name(String First_name){
        this.First_name=First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getEmail() {
        return Email;

    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString(){
        return  "Cust{"+
                "ID="+Customer_ID+
                ", '"+First_name+'\''+
                " '"+Last_name+'\''+
                ", Email="+Email+'\''+
                "}\n";
    }

}
