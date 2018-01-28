package pl.waw.sgh.tax;

import pl.waw.sgh.tax.exceptions.TaxException;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class Tax {
    private List<Taxpayer> Taxpayer_list=new ArrayList<>();
    private List<Employer> Employer_list=new ArrayList<>();
    private List<TaxAccount> TaxAccount_list=new ArrayList<>();

    private Integer Last_Taxpayer_ID=0;
    private Integer Last_Employer_ID=0;
    public Integer Last_TaxAccount_ID=0;

    public Taxpayer FindTaxpayerByID(Integer ID) throws TaxException{
        for(Taxpayer Taxpayer:Taxpayer_list){
            if(ID.equals(Taxpayer.getTaxpayer_ID())) return Taxpayer;
        }
        throw new TaxException("Taxpayer with ID: " + ID + " does not exist.");
    }

    public Employer FindEmployerByID(Integer ID) throws TaxException{
        for (Employer Employer:Employer_list){
            if(ID.equals(Employer.getEmployer_ID())) return Employer;
        }
        throw new TaxException("Employer with ID: " + ID + " does not exist.");
    }

    public TaxAccount FindTaxAccountByID(Integer ID) throws TaxException{
        for(TaxAccount tmpTaxAccount:TaxAccount_list){
            if(tmpTaxAccount.getTaxAccount_ID().equals(ID)) {
                return tmpTaxAccount;
            }

        }
        throw new TaxException("Taxpayer with ID: " + ID + " does not exist.");
    }

    public Taxpayer CreateTaxpayer(String First_name, String Last_name){
        Taxpayer Taxpayer=new Taxpayer(Last_Taxpayer_ID++,First_name,Last_name);
        Taxpayer_list.add(Taxpayer);
        return Taxpayer;
    }

    public Employer CreateEmployer(String Employer_name){
        Employer Employer=new Employer(Last_Employer_ID++,Employer_name);
        Employer_list.add(Employer);
        return Employer;
    }

    public TaxAccount CreateTaxAccount(Taxpayer Taxpayer, Employer Employer, BigDecimal Income, BigDecimal DeductibleExpenses, Double Advance, BigDecimal SocialInsurance, Double HealthInsurance){
        TaxAccount TaxAccount=new TaxAccount (Last_TaxAccount_ID++,Taxpayer,Employer,Income,DeductibleExpenses,Advance,SocialInsurance,HealthInsurance);
        TaxAccount_list.add(TaxAccount);
        return TaxAccount;
    }

    public List<Taxpayer> getTaxpayer_list() {
        return Taxpayer_list;
    }

    public List<Employer> getEmployer_list() {
        return Employer_list;
    }
    public void setEmployer_list(List<Employer> Employer_list) {
        this.Employer_list = Employer_list;
    }
    public List<TaxAccount> getTaxAccount_list() {
        return TaxAccount_list;
    }
    public void setTaxAccount_list(List<TaxAccount> TaxAccount_list) {
        this.TaxAccount_list = TaxAccount_list;
    }
    @Override
    public String toString() {
        return "Taxpayers:\n" + Taxpayer_list + ",\n Employers:\n" + Employer_list + ",\n TaxAccounts:\n" + TaxAccount_list;
    }
}
