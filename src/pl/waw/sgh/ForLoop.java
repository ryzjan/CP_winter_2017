package pl.waw.sgh;

public class ForLoop {
    public static void main(String[] args) {
        int c=0;
        c++;
        c=c+1;

        int d;
        d=c++;
        //d=++c;
        //System.out.println(d);
        int e=--c;
        System.out.println("c="+c);
        System.out.println("d="+d);

        //System.out.println();

        String s1="abc";
        Integer i1=35445;
        s1=s1+i1;

        //String s2=i1.toString();
        //s1=s1.concat(s2);
        System.out.println(s1);

        for (int i=0;i<5;i++){
            System.out.println("i"+i);
        }

        /* TODO: What happens here?
        System.out.println();
         */

        // if inside for
        for(int j=5;j>0;j--){
            //pomija j==4
            if (j==4) continue;
            System.out.println("j".concat(new Integer(j).toString()));
            //System.out.println("j="+j);
            if(j==2) break;
        }






    }
}
