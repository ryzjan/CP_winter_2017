package pl.waw.sgh.tax;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TaxAccount {
    private Integer TaxAccount_ID;
    private Taxpayer Taxpayer;
    private Employer Employer;
    private BigDecimal Income;
    private BigDecimal DeductibleExpenses;
    private BigDecimal Revenue_c;
    private Double Advance;
    private BigDecimal SocialInsurance;
    private BigDecimal DeductedRevenue_c;
    private Double Tax_Base_c;
    private Double Tax_DeductableAmount_c;
    private Double Tax_c;
    private Double HealthInsurance;
    private Double TaxOutput_c;
    private Double TaxDue_c;
    private String TaxDue_s;
    private Double TaxOverpaid_c;
    private String TaxOverpaid_s;



    public TaxAccount(Integer TaxAccount_ID, Taxpayer Taxpayer, Employer Employer, BigDecimal Income,BigDecimal DeductibleExpenses,Double Advance,BigDecimal SocialInsurance,Double HealthInsurance){
        this.TaxAccount_ID=TaxAccount_ID;
        this.Taxpayer=Taxpayer;
        this.Employer=Employer;
        this.Income=Income;
        this.DeductibleExpenses=DeductibleExpenses;
        this.Revenue_c=this.Income.subtract(this.DeductibleExpenses);
        this.Advance=Advance;
        this.SocialInsurance=SocialInsurance;
        this.DeductedRevenue_c=this.Revenue_c.subtract(this.SocialInsurance);
        this.Tax_Base_c=this.DeductedRevenue_c.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();




        if ((0.00<this.Tax_Base_c)&&(this.Tax_Base_c<=6600.00)) {
            this.Tax_DeductableAmount_c = 1188.00;
        }
        else if ((6600.00<this.Tax_Base_c)&&(this.Tax_Base_c<=11000.00)){
            this.Tax_DeductableAmount_c = 1188.00-(631.98*(this.Tax_Base_c-6600.00)/4400.00);
        }
        else if ((11000.00<this.Tax_Base_c)&&(this.Tax_Base_c<=85528.00)){
            this.Tax_DeductableAmount_c = 556.02;
        }
        else if ((85528.00<this.Tax_Base_c)&&(this.Tax_Base_c<=127000.00)){
            this.Tax_DeductableAmount_c = 556.02-(556.02*(this.Tax_Base_c-85528.00)/41472.00);
        }
        else {
            this.Tax_DeductableAmount_c =0.00;
        }


        if ((0.00<Tax_Base_c)&&(Tax_Base_c<=85528.00)){
            this.Tax_c=(0.18*this.Tax_Base_c)-this.Tax_DeductableAmount_c;
        }
        else if (Tax_Base_c>85528.00){
            this.Tax_c=15395.04+0.32*(this.Tax_Base_c-85528.00);
        }
        else{
            this.Tax_c=0.00;
        }



        this.HealthInsurance=HealthInsurance;
        this.TaxOutput_c=this.Tax_c-this.HealthInsurance;

        DecimalFormat df = new DecimalFormat("# ##.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        if (this.TaxOutput_c<=0){
            this.TaxDue_c=0.00;
            this.TaxOverpaid_c=0.00;
        }
        else {
            if (this.TaxOutput_c - this.Advance > 0.00) {
                this.TaxDue_c = this.TaxOutput_c - this.Advance;
                this.TaxOverpaid_c = 0.00;

                this.TaxOverpaid_s = df.format(TaxOverpaid_c);
                this.TaxDue_s=df.format(TaxDue_c);
            } else {
                this.TaxDue_c = 0.00;
                this.TaxOverpaid_c = -(this.TaxOutput_c - this.Advance);

                this.TaxOverpaid_s=df.format(TaxOverpaid_c);
                this.TaxDue_s=df.format(TaxDue_c);

            }
        }



    }
    public Integer getTaxAccount_ID() {
        return TaxAccount_ID;
    }
    public void setTaxAccount_ID(Integer TaxAccount_ID) {
        this.TaxAccount_ID = TaxAccount_ID;
    }

    public Taxpayer getTaxpayer() {
        return Taxpayer;
    }
    public void setTaxpayer(pl.waw.sgh.tax.Taxpayer taxpayer) {
        this.Taxpayer = taxpayer;
    }

    public pl.waw.sgh.tax.Employer getEmployer() {
        return Employer;
    }
    public void setEmployer (Employer Employer){
        this.Employer=Employer;
    }

    public BigDecimal getIncome() {
        return Income;
    }
    public void setIncome(BigDecimal income) {
        this.Income = income;
    }

    public BigDecimal getDeductibleExpenses() {
        return DeductibleExpenses;
    }
    public void setDeductibleExpenses(BigDecimal deductibleExpenses) {
        this.DeductibleExpenses = deductibleExpenses;
    }

    public BigDecimal getRevenue_c() {
        return Revenue_c;
    }

    public Double getAdvance() {
        return Advance;
    }
    public void setAdvance (Double Advance){
        this.Advance=Advance;
    }

    public BigDecimal getSocialInsurance() {
        return SocialInsurance;
    }
    public void setSocialInsurance(BigDecimal socialInsurance) {
        this.SocialInsurance = socialInsurance;
    }

    public BigDecimal getDeductedRevenue_c() {
        return DeductedRevenue_c;
    }

    public Double getTax_Base_c() {
        return Tax_Base_c;
    }

    public Double getTax_DeductableAmount_c() {
        return Tax_DeductableAmount_c;
    }

    public Double getTax_c() {
        return Tax_c;
    }

    public Double getHealthInsurance() {
        return HealthInsurance;
    }
    public void setHealthInsurance(Double HealthInsurance){
        this.HealthInsurance=HealthInsurance;
    }

    public Double getTaxOutput_c() {
        return TaxOutput_c;
    }

    public String getTaxDue_s() {
        return TaxDue_s;
    }

    public String getTaxOverpaid_s() {
        return TaxOverpaid_s;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("TaxAccount", "")+"\n"+TaxAccount_ID+","+Taxpayer.getTaxpayer_ID()+","+Taxpayer.getFirst_name()+","+Taxpayer.getLast_name()+","+Employer.getEmployer_ID()+","+Employer.getEmployer_name()+","+Income+","+DeductibleExpenses+","+Revenue_c+","+Advance+","+SocialInsurance+","+DeductedRevenue_c+","+Tax_Base_c+","+Tax_DeductableAmount_c+","+Tax_c+","+HealthInsurance+","+TaxOutput_c+","+TaxDue_s+","+TaxOverpaid_s+"\n";
    }
}
