package pl.waw.sgh;

public class StringOper {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";

        String s3= s1+s2;
        String s4= s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);

        //count from 0, indexing starts with 0
        String s5=s3.substring(3);
        System.out.println(s5);
        String s6=s3.substring(2, 5);
        System.out.println(s6);
        //searches from the beginning
        int bPos=s3.indexOf("b");
        //searches from the end
        // s3.lastIndexOf("cd");
        System.out.println("bPos"+bPos);

        //s6=s3.replace('b','B');
        s6=s3.replace("bc","B");
        System.out.println(s6);
        System.out.println(s6.charAt(4));
        if (s6.startsWith("aB")){
            System.out.println("s5 starts with aB");
        }




    }

}
