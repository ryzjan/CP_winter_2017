package pl.waw.sgh;

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
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        //Result: 2017-12-12 21:17:18

    }


}
