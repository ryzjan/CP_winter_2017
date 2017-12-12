package pl.waw.sgh;

public class InputArgs {
    public static void main(String[] args) {
        double s=0;
        for(String a:args){
            s+=Double.parseDouble(a);
        }
        System.out.println("Sum of arguments is: "+s);
    }
}
