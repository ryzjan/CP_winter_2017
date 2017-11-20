package pl.waw.sgh;

public class Arrays {
    //function:
    public static Double sumDoubles(Double[] arr){

        Double sum=0d;
        for(Double el: arr) {
            //+= adds el to the sum
            sum+=el;
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] myIntArr=new Integer[5];
        Double[] myDbArr=new Double[] {5625.4, 585.78, 45888.11};

        myIntArr[0]=7845;
        myIntArr[1]=478541;
        myIntArr[2]=47152;

        Integer sum=0;

        for(int i=0; i<myIntArr.length; i++) {
            System.out.println("myIntArr, element " +i+" = "+myIntArr[i]);
        //if breaks here, program shows null elements of myIntArr
            }

    }


}
