package pl.waw.sgh.tax;

public class Taxpayer {
    private Integer Taxpayer_ID;
    private String First_name;
    private String Last_name;
    private String Address;

    public Taxpayer(Integer Taxpayer_ID, String First_name, String Last_name) {
        this.Taxpayer_ID = Taxpayer_ID;
        this.First_name = First_name;
        this.Last_name = Last_name;

    }
    public Integer getTaxpayer_ID() {
        return Taxpayer_ID;
    }
    public void setTaxpayer_ID(Integer Taxpayer_ID) {
        this.Taxpayer_ID = Taxpayer_ID;
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


    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString(){
        return Taxpayer_ID+","+First_name+","+Last_name+","+Address+"\n";
    }

}

