package pl.waw.sgh;
import javax.swing.*;

public class GuiInput {
    public static void main(String[] args) {

        int dec=JOptionPane.YES_OPTION;
        while(dec!=JOptionPane.NO_OPTION){
                String input = JOptionPane.showInputDialog(
                        null, "Please provide your name: ");
                JOptionPane.showMessageDialog(null, "Hello " + input);
                dec= JOptionPane.showConfirmDialog(null, "Do you want to continue?");
                //Like boolean?
                JOptionPane.showMessageDialog(null, "Decision is: "+dec);
        }

            }
}
