package ex_04_Java_Operators;

import java.sql.SQLOutput;

public class Lab043_interviewQuestion2
{
    public static void main(String[] args) {
        String firstname = "Vaishnavi";
        String lastname = "BAnkar";

        int a = 10;
        int b = 20;

        System.out.println(firstname + lastname + a + b);
        // This operator will act as a joiner- so a+b will also be just joined! it will take them as string

        System.out.println(a + b + firstname + lastname);
        // This operater will sum as they are int first. but later will be considered as string only

        System.out.println(firstname + lastname + (a + b));
        //Using bracket makes them integer- BODMAS!
    }
}
