package pl.waw.sgh;

public class Conditions {
    public static void main(String[] args) {

        int b=6;

        {
            int a=5;
            System.out.println("Run from a sub block");
            System.out.println("a=" + a);
            System.out.println("b="+b);
            {
                int c=8;
                System.out.println("a=" + a);
                System.out.println("b=" + b);
                System.out.println("c=" + c);
            }
        }
        //a is not visible outside block
        //System.out.println("a="+a );
        System.out.println("b=" +b);

        //TODO sth to do

        boolean myCond =false;

        //if musi byc bez ";"
        if(myCond) {
            System.out.println("myCond is true");
            System.out.println("I'm in the first if block");
        }
        /*else {
            System.out.println("myCond is false");
        }*/

        // > >= < <= ==
        //compare with a value - primitive data type
        if (b==6) {
            System.out.println("b=6");
        }

        String s1="abc";
        String s2="abc";

        String s3= new String("abc");

        if (s1==s2){
            System.out.println("String s1 and s2 are equal");
        }
        if (s1==s3){
            System.out.println("String s1 and s3 are equal");
        }
        //equals - comparison by value - tego uzywac tez do int, on all objects
        //== - comparison by object! - only on permitive data types
        if (s1.equals(s3)){
            System.out.println("String s1 and s3 are equal using equals method");
        }


        if (b>4 && s1.equals(s3)) {
            System.out.println("b>4 and s1 s3 store the same text");
        }

        int c;
        if (b>4)
            c=b;
        else
            c=2;
        //to samo:
        c = (b>4)?b:2;



    }

}
