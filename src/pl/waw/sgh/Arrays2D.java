package pl.waw.sgh;

public class Arrays2D {

    public static void main(String[] args) {
        int[][] arr2D = new int[3][4];
        // 2D array 3x4 - 3 lines, 4 columns. Lines count from 0!!!

        arr2D[0][3]=41;
        arr2D[0][0]=585;
        arr2D[1][1]=214;
        arr2D[2][2]=847;
        arr2D[2][3]=985;

        System.out.println("Length of arr2D: "+arr2D.length);
        System.out.println("#columns of arr2D: "+arr2D[0].length);

        //for loop - prints the arr2D
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++) {
                //not println
                System.out.print(arr2D[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("------");
        }
    }


