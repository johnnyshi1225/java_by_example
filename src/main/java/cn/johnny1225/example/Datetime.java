package cn.johnny1225.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by johnny on 15/11/20.
 */
public class Datetime {

    static void current() {
        long ts = System.currentTimeMillis() / 1000;
        System.out.println(ts);

        Date date = new Date();
        System.out.println(date.getTime() / 1000);
    }

    static void stringToDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);

        try {
            Date date = format.parse("24/Aug/2015:14:39:22 +0800");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        current();
        stringToDate();
    }

}
