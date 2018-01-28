package pl.waw.sgh.tax.ui;

import pl.waw.sgh.tax.Employer;
import pl.waw.sgh.tax.Tax;
import pl.waw.sgh.tax.TaxAccount;
import pl.waw.sgh.tax.Taxpayer;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import pl.waw.sgh.tax.exceptions.TaxException;

public class TaxUI {
    private JPanel panel1;

    private JTextField textField_FirstName;
    private JTextField textField_TaxpayerID;
    private JTextField textField_LastName;
    private JButton nextButton;
    private JButton saveChangesButton;
    private JButton previousButton;
    private JButton beginCreationOfNewButton;
    private JTextField textField_EmployerID;
    private JTextField textField_EmployerName;
    private JTextField textField_TaxAccountID;
    private JTextField textField_Income;
    private JTextField textField_DeductibleExpenses;
    private JTextField textField_Advance;
    private JTextField textField_SocialInsurance;
    private JTextField textField_HealthInsurance;
    private JTextField textField_Revenue_c;
    private JTextField textField_DeductedRevenue_c;
    private JTextField textField_Tax_Base_c;
    private JTextField textField_Tax_c;
    private JTextField textField_TaxOutput_c;
    private JTextField textField_TaxDue_s;
    private JTextField textField_TaxOverpaid_s;

    private JButton createViewTaxpayersButton;
    private JButton createViewEmployersButton;

    private Tax tax = new Tax();

    private Taxpayer Taxpayer_a;
    private Employer Employer_a;
    private TaxAccount TaxAccount_a;




    public static void main(String[] args) {
        JFrame Frame1 = new JFrame("Tax UI");
        TaxUI TaxUI = new TaxUI();
        Frame1.add(TaxUI.panel1);
        Frame1.setSize(1000, 600);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame1.setVisible(true);
    }

    public void TaxpayerUI() {

            try{
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            }
            catch (UnsupportedLookAndFeelException e){}
            catch (ClassNotFoundException e) {}
            catch (InstantiationException e) {}
            catch (IllegalAccessException e) {}

            JFrame Frame1=new JFrame("Taxpayer UI");
            Frame1.setSize(1000,100);
            Frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            LayoutManager LayoutManager1=new FlowLayout();
            Frame1.setLayout(LayoutManager1);

        JPanel IDPanel=new JPanel();
        JLabel Label0=new JLabel("Taxpayer ID");
        IDPanel.add(Label0);
        JTextField IDField=new JTextField(10);
        IDPanel.add(IDField);
        Frame1.add(IDPanel);

            JPanel FirstNamePanel=new JPanel();
            JLabel Label1=new JLabel("First Name");
            FirstNamePanel.add(Label1);
            JTextField FirstNameField=new JTextField(25);
            FirstNamePanel.add(FirstNameField);
            Frame1.add(FirstNamePanel);

            JPanel LastNamePanel=new JPanel();
            JLabel Label2=new JLabel("Last Name");
            LastNamePanel.add(Label2);
            JTextField LastNameField=new JTextField(25);
            LastNamePanel.add(LastNameField);
            Frame1.add(LastNamePanel);

            JButton nextButton1=new JButton("Next");
            JButton previousButton1=new JButton("Previous");
            JButton saveChangesButton1=new JButton("Save Changes");
            JButton newButton1=new JButton("Begin creation of new taxpayer");
            JButton hideButton1=new JButton("Hide");




        nextButton1.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {
                                             int TaxPayerIndex =tax.getTaxpayer_list().indexOf(Taxpayer_a);
                                             if(TaxPayerIndex<tax.getTaxpayer_list().size()-1){

                                                 Taxpayer_a=tax.getTaxpayer_list().get(TaxPayerIndex+1);
                                                 IDField.setText(Taxpayer_a.getTaxpayer_ID().toString());
                                                 FirstNameField.setText(Taxpayer_a.getFirst_name());
                                                 LastNameField.setText(Taxpayer_a.getLast_name());
                                             }




                                         }
                                     }
        );
        previousButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int TaxPayerIndex=tax.getTaxpayer_list().indexOf(Taxpayer_a);
                if(TaxPayerIndex>0){
                    Taxpayer_a=tax.getTaxpayer_list().get(TaxPayerIndex-1);
                    IDField.setText(Taxpayer_a.getTaxpayer_ID().toString());
                    FirstNameField.setText(Taxpayer_a.getFirst_name());
                    LastNameField.setText(Taxpayer_a.getLast_name());

                }
            }
        });

        newButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Taxpayer Taxpayer_n = tax.CreateTaxpayer("", "");
                Taxpayer_a=Taxpayer_n;
                IDField.setText(Taxpayer_n.getTaxpayer_ID().toString());
                FirstNameField.setText("");
                LastNameField.setText("");


            }
        });
        saveChangesButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(IDField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "You are not editing any existing taxpayer.\nPlease choose existing taxpayer or create a new one.");
                }
                else {
                    try {
                        Integer Taxpayer_ID = Integer.valueOf(IDField.getText());
                        Taxpayer Taxpayer = tax.FindTaxpayerByID(Taxpayer_ID);
                        Taxpayer.setFirst_name(FirstNameField.getText());
                        Taxpayer.setLast_name(LastNameField.getText());
                                                JOptionPane.showMessageDialog(null, "Changes saved successfully.");
                    } catch (TaxException a) {
                        JOptionPane.showMessageDialog(null, a.getMessage());

                    }

                }
            }
        });

        hideButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame1.setVisible(false);
            }});


            JPanel BtnPanel1=new JPanel();
            BtnPanel1.add(nextButton1);
            BtnPanel1.add(previousButton1);
            BtnPanel1.add(saveChangesButton1);
            BtnPanel1.add(newButton1);
            BtnPanel1.add(hideButton1);
            Frame1.add(BtnPanel1);

            Frame1.setVisible(true);






        }


    public void EmployerUI() {

        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        }
        catch (UnsupportedLookAndFeelException e){}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}

        JFrame Frame1=new JFrame("Employer UI");
        Frame1.setSize(1000,100);
        Frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        LayoutManager LayoutManager1=new FlowLayout();
        Frame1.setLayout(LayoutManager1);

        JPanel IDPanel=new JPanel();
        JLabel Label0=new JLabel("Employer ID");
        IDPanel.add(Label0);
        JTextField IDField=new JTextField(10);
        IDPanel.add(IDField);
        Frame1.add(IDPanel);

        JPanel EmployerNamePanel=new JPanel();
        JLabel Label1=new JLabel("Employer Name");
        EmployerNamePanel.add(Label1);
        JTextField EmployerNameField=new JTextField(25);
        EmployerNamePanel.add(EmployerNameField);
        Frame1.add(EmployerNamePanel);


        JButton nextButton1=new JButton("Next");
        JButton previousButton1=new JButton("Previous");
        JButton saveChangesButton1=new JButton("Save Changes");
        JButton newButton1=new JButton("Begin creation of new employer");
        JButton hideButton1=new JButton("Hide");




        nextButton1.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              int EmployerIndex =tax.getEmployer_list().indexOf(Employer_a);
                                              if(EmployerIndex<tax.getEmployer_list().size()-1){

                                                  Employer_a=tax.getEmployer_list().get(EmployerIndex+1);
                                                  IDField.setText(Employer_a.getEmployer_ID().toString());
                                                  EmployerNameField.setText(Employer_a.getEmployer_name());

                                              }
                                          }
                                      }
        );
        previousButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int EmployerIndex=tax.getEmployer_list().indexOf(Employer_a);
                if(EmployerIndex>0){
                    Employer_a=tax.getEmployer_list().get(EmployerIndex-1);
                    IDField.setText(Employer_a.getEmployer_ID().toString());
                    EmployerNameField.setText(Employer_a.getEmployer_name());

                }
            }
        });

        newButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employer Employer_n = tax.CreateEmployer("");
                Employer_a=Employer_n;
                IDField.setText(Employer_n.getEmployer_ID().toString());
                EmployerNameField.setText(Employer_n.getEmployer_name());

            }
        });
        saveChangesButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(IDField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "You are not editing any existing employer.\nPlease choose existing employer or create a new one.");
                }
                else {
                    try {
                        Integer Employer_ID = Integer.valueOf(IDField.getText());
                        Employer Employer = tax.FindEmployerByID(Employer_ID);
                        Employer.setEmployer_name(EmployerNameField.getText());

                        JOptionPane.showMessageDialog(null, "Changes saved successfully.");
                    } catch (TaxException a) {
                        JOptionPane.showMessageDialog(null, a.getMessage());

                    }

                }
            }
        });

        hideButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame1.setVisible(false);
            }});


        JPanel BtnPanel1=new JPanel();
        BtnPanel1.add(nextButton1);
        BtnPanel1.add(previousButton1);
        BtnPanel1.add(saveChangesButton1);
        BtnPanel1.add(newButton1);
        BtnPanel1.add(hideButton1);
        Frame1.add(BtnPanel1);

        Frame1.setVisible(true);






    }




        public void ChooseTaxAccount(TaxAccount TaxAccount) {
        TaxAccount_a = TaxAccount;
        //Taxpayer_a = TaxAccount.getTaxpayer();
        //Employer_a = TaxAccount.getEmployer();

        textField_TaxpayerID.setText(TaxAccount_a.getTaxpayer().getTaxpayer_ID().toString());
        textField_FirstName.setText(TaxAccount_a.getTaxpayer().getFirst_name());
        textField_LastName.setText(TaxAccount_a.getTaxpayer().getLast_name());

        textField_EmployerID.setText(TaxAccount_a.getEmployer().getEmployer_ID().toString());
        textField_EmployerName.setText(TaxAccount_a.getEmployer().getEmployer_name());

        textField_TaxAccountID.setText(TaxAccount.getTaxAccount_ID().toString());
        textField_Income.setText(TaxAccount.getIncome().toString());
        textField_DeductibleExpenses.setText(TaxAccount.getDeductibleExpenses().toString());
        textField_Advance.setText(TaxAccount.getAdvance().toString());
        textField_SocialInsurance.setText(TaxAccount.getSocialInsurance().toString());
        textField_HealthInsurance.setText(TaxAccount.getHealthInsurance().toString());
        textField_Revenue_c.setText(TaxAccount.getRevenue_c().toString());
        textField_DeductedRevenue_c.setText(TaxAccount.getDeductedRevenue_c().toString());
        textField_Tax_Base_c.setText(TaxAccount.getTax_Base_c().toString());
        textField_Tax_c.setText(TaxAccount.getTax_c().toString());
        textField_TaxOutput_c.setText(TaxAccount.getTaxOutput_c().toString());
        textField_TaxDue_s.setText(TaxAccount.getTaxDue_s());
        textField_TaxOverpaid_s.setText(TaxAccount.getTaxOverpaid_s());

           }

    public TaxUI() {
        nextButton.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {

                                             int TaxAccountIndex = tax.getTaxAccount_list().indexOf(TaxAccount_a);
                                             if (TaxAccountIndex < tax.getTaxAccount_list().size() - 1) {
                                                 ChooseTaxAccount(tax.getTaxAccount_list().get(TaxAccountIndex + 1));
                                             }


                                         }
                                     }
        );
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int TaxAccountIndex = tax.getTaxAccount_list().indexOf(TaxAccount_a);
                if (TaxAccountIndex > 0) {
                    ChooseTaxAccount(tax.getTaxAccount_list().get(TaxAccountIndex - 1));

                }
            }
        });

        beginCreationOfNewButton.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {




                                              textField_TaxpayerID.setText("");
                                              textField_FirstName.setText("");
                                              textField_LastName.setText("");

                                              textField_EmployerID.setText("");
                                              textField_EmployerName.setText("");
                                          textField_Income.setText("");
                                          textField_DeductibleExpenses.setText("");
                                          textField_Advance.setText("");
                                          textField_SocialInsurance.setText("");
                                          textField_HealthInsurance.setText("");


                                              textField_Revenue_c.setText("");
                                              textField_DeductedRevenue_c.setText("");
                                              textField_Tax_Base_c.setText("");
                                              textField_Tax_c.setText("");
                                              textField_TaxOutput_c.setText("");
                                              textField_TaxDue_s.setText("");
                                              textField_TaxOverpaid_s.setText("");




                                      }
                                  }
        );

        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField_TaxpayerID.getText().isEmpty()||textField_EmployerID.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the correct Taxpayer ID/Employer ID!");
                }
                else {

                    try {
                        TaxAccount TaxAccount_n = tax.CreateTaxAccount(tax.FindTaxpayerByID(Integer.valueOf(textField_TaxpayerID.getText())), tax.FindEmployerByID(Integer.valueOf(textField_EmployerID.getText())), BigDecimal.valueOf(Double.valueOf(textField_Income.getText())), BigDecimal.valueOf(Double.valueOf(textField_DeductibleExpenses.getText())), Double.valueOf(textField_Advance.getText()), BigDecimal.valueOf(Double.valueOf(textField_SocialInsurance.getText())), (Double.valueOf(textField_HealthInsurance.getText())));


                        TaxAccount_a = TaxAccount_n;
                        textField_TaxAccountID.setText(TaxAccount_n.getTaxAccount_ID().toString());

                        textField_TaxpayerID.setText(TaxAccount_n.getTaxpayer().getTaxpayer_ID().toString());
                        textField_FirstName.setText(TaxAccount_n.getTaxpayer().getFirst_name());
                        textField_LastName.setText(TaxAccount_n.getTaxpayer().getLast_name());

                        textField_EmployerID.setText(TaxAccount_n.getEmployer().getEmployer_ID().toString());
                        textField_EmployerName.setText(TaxAccount_n.getEmployer().getEmployer_name());


                        textField_Revenue_c.setText(TaxAccount_n.getRevenue_c().toString());
                        textField_DeductedRevenue_c.setText(TaxAccount_n.getDeductedRevenue_c().toString());
                        textField_Tax_Base_c.setText(TaxAccount_n.getTax_Base_c().toString());
                        textField_Tax_c.setText(TaxAccount_n.getTax_c().toString());
                        textField_TaxOutput_c.setText(TaxAccount_n.getTaxOutput_c().toString());
                        textField_TaxDue_s.setText(TaxAccount_n.getTaxDue_s());
                        textField_TaxOverpaid_s.setText(TaxAccount_n.getTaxOverpaid_s());

                        JOptionPane.showMessageDialog(null, "Tax declaration prepared successfully.");
                    } catch (TaxException a) {
                        JOptionPane.showMessageDialog(null, a.getMessage());

                    }

                }}
            }
        );

        createViewTaxpayersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaxpayerUI();
            }});
        createViewEmployersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployerUI();
            }});


    }
}
