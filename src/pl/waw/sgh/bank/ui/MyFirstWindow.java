package pl.waw.sgh.bank.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstWindow {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        }
        catch (UnsupportedLookAndFeelException e){}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}

        JFrame Frame1=new JFrame("My Frame");
        Frame1.setSize(800,600);
        Frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        LayoutManager LayoutManager1=new FlowLayout();
        Frame1.setLayout(LayoutManager1);

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

        JButton Button1=new JButton("Login");
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ActionEvent) {
                String res=FirstNameField.getText();
                JOptionPane.showMessageDialog(null, "Got: " + res + " " + LastNameField.getText());
            }
        });

        JPanel BtnPanel1=new JPanel();
        BtnPanel1.add(Button1);
        Frame1.add(BtnPanel1);

        Frame1.setVisible(true);






    }

}
