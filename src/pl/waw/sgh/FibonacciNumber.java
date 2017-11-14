package pl.waw.sgh;

public class FibonacciNumber {
    //function:
    public static int  f_loop(int n){


        int a=1, b=1,c=0;//without an extension by initial "0"
        for (int i=1;i<=n-1;++i){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
        return a;

    }

    //call function:
    public static void main(String[] args) {
        int n=5;//5 first elements
        System.out.println(f_loop(n));
    }
}
