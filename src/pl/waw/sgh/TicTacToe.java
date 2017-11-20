package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TicTacToe {

    static final String FILE_LOC = "/home/jas/game1.txt";

    public static void main(String[] args) throws
            FileNotFoundException {
        String[][] GameArr = new String[3][3];
        File file = new File(FILE_LOC);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String myLine = scanner.nextLine();
            //System.out.println(myLine);
            String[] elem = myLine.split(",");
            for (String el : elem) {
                for (int i = 0; i < GameArr.length; i++) {
                    for (int j = 0; j < GameArr[i].length; j++) {
                        GameArr[i][j] = el;
                    }


                }
                System.out.println("= " + el);
            }

            }
        for (int i=0;i<GameArr.length;i++) {
            // process every cell
            for (int j=0;j<GameArr[i].length;j++) {
                System.out.print(GameArr[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}
