package wrapperClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class NumberConversion {
    public static void main(String[] args) {
        String binary = "11000110";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "657";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println(decimal2);

        String hexaDecimal = "A";
        Integer decimal3 = Integer.parseInt(hexaDecimal, 16);
        System.out.println(decimal3);


        int decimal4 = 15;
        String output = Integer.toHexString(decimal4);
        System.out.println(output);

        //date class in java
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = format.format(date);
        System.out.println(dateString);

        // java time class

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);


        Random rand = new Random();
        int randomNum = rand.nextInt(100); //random number from 0 to 99
        System.out.println(randomNum);

    }

}
