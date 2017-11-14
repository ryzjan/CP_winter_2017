package pl.waw.sgh;

public class FibonacciSum {
//function:
    public static int  f_loop(int n){

        if (n==1||n==2){ //without an extension by initial "0"
            return 1;
        }

        int a=1, b=1, c, s=2;
        for (int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            s=s+c;
        }
        return s;
    }

//call function:
    public static void main(String[] args) {
        int n=4;
        System.out.println("The sum of "+n+" Fibonacci numbers is: "+f_loop(n));
    }
}


