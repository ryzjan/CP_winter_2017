package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;
import pl.waw.sgh.bank.exceptions.BankException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CustomerUI {
    private JPanel panel1;
    private JTextField textField_FirstName;
    private JTextField textField_ID;
    private JTextField textField_LastName;
    private JTextField textField_Email;
    private JButton nextButton;
    private JButton previousButton;
    private JButton saveButton;

    private Bank bank = new Bank();
    private Customer Customer_a;



    public static void main(String[] args) {
        JFrame Frame1=new JFrame("Customer UI");
        CustomerUI CustomerUI=new CustomerUI();
        Frame1.add(CustomerUI.panel1);
        Frame1.setSize(500 ,300);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame1.setVisible(true);
    }
    public void ChooseCustomer(Customer Customer){
        Customer_a=Customer;
        textField_ID.setText(Customer.getCustomer_ID().toString());
        textField_FirstName.setText(Customer.getFirst_name());
        textField_LastName.setText(Customer.getLast_name());
        textField_Email.setText(Customer.getEmail().toString());

    }

    public CustomerUI(){
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int CustIndex =bank.getCustomer_list().indexOf(Customer_a);
                if(CustIndex==bank.getCustomer_list().size()){}
                    else {
                    ChooseCustomer(bank.getCustomer_list().get(CustIndex+1));
                }



                }
            }
        );
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int CustIndex=bank.getCustomer_list().indexOf(Customer_a);
                if(CustIndex>0){
                    ChooseCustomer(bank.getCustomer_list().get(CustIndex-1));

                }
            }
        });



    }





}

