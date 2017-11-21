package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TicTacToe {

    static final String FILE_LOC = "/home/jas/tictactoe.txt";

    public static void main(String[] args) throws
            FileNotFoundException{
        File file=new File(FILE_LOC);
        String[][] arr2D = new String[3][3];
        Scanner scanner=new Scanner(file);
        int i=0;
        while (scanner.hasNext()){

            String myLine= scanner.nextLine();
            //System.out.println(myLine);
            String[] elem=myLine.split(",");
            int j=0;
            for (String el:elem) {
                arr2D[i][j]=el;
                //System.out.println("= " + el);
                j++;
            }
            i++;
        }
        for(int k=0;k<arr2D.length;k++){
            for(int l=0;l<arr2D[k].length;l++) {
                //not println
                System.out.print(arr2D[k][l]);
            }
            System.out.println("|");
        }
        System.out.println("------");

    }
}




