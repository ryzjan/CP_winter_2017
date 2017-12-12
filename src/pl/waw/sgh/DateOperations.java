package pl.waw.sgh;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {
    public static void main(String[] args) {
        Long startMillis=System.currentTimeMillis();
        Date date=new Date();
        System.out.println(date);
        //Result: Tue Dec 12 21:17:18 CET 2017
        System.out.println(System.currentTimeMillis());
        //Result: 1513109838812
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        //Result: 2017-12-12 21:17:18
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        boolean success=false;
        Date outDate=null;
                while(!success){
                    try{
                        //String inDate = null;
                        String inDate=JOptionPane.showInputDialog(null, "Please provide the date: ");
                        outDate=sdf2.parse(inDate);

                        //Add 10 days to the ^^ date
                        Calendar c=Calendar.getInstance();
                        c.setTime(outDate);
                        c.add(Calendar.DATE,10);
                        outDate=c.getTime();
                        //outDate=sdf2.parse(inDate);
                        success=true;

                    } catch (ParseException|NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Cannot parse the date provided, please try again!");
                        e.printStackTrace();
                    }
                }
        JOptionPane.showMessageDialog(null, "Your date: "+sdf.format(outDate));
        Long stopMillis=System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "It took: "+(stopMillis-startMillis)+" ms.");

    }


}
