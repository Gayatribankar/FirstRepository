package ex_04_Java_Operators;

public class Lab047_OR_AND_GATE
{
    public static void main(String[] args) {
        //OR GATE "||"
        System.out.println(true||true); //true
        System.out.println(false||true); //true
        System.out.println(false||false);//false
        System.out.println(true||false); //true

        //AND GATE "&&"
        System.out.println(true&&true); //true
        System.out.println(false&&true); //false
        System.out.println(false&&false);//false
        System.out.println(true&&false); //false
    }
}
