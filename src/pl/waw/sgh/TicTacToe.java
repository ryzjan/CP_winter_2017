package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TicTacToe {

    static final String FILE_LOC = "/home/jas/ticktacktoe.txt";

    public static void main(String[] args) throws
            FileNotFoundException {
        File file = new File(FILE_LOC);
        int[][] arr2D = new int[3][3];
        Scanner scanner = new Scanner(file);
        int z;
        int i = 0;
        while (scanner.hasNext()) {

            String myLine = scanner.nextLine();
            //System.out.println(myLine);
            String[] elem = myLine.split(",");
            int j = 0;
            for (String el : elem) {
                z = Integer.parseInt(el);

                arr2D[i][j] = z;


                //System.out.println("= " + el);
                j++;
            }
            i++;
        }
        for (int k = 0; k < arr2D.length; k++) {
            for (int l = 0; l < arr2D[k].length; l++) {
                //not println
                System.out.print(arr2D[k][l]);
            }
            System.out.println("|");
        }
        System.out.println("------");
        //check rows
        for (int a = 0; a < 3; a++) {
            int sum = 0;
            for (int b = 0; b < 3; b++) {
                sum += arr2D[a][b];
            }
            if (sum == 3) {
                System.out.println("Player X wins!");
                break;
            } else if (sum == -3) {
                System.out.println("Player O wins!");
                break;
            } else
                continue;
        }
        //check columns
        for (int a = 0; a < 3; a++) {
            int sum = 0;
            for (int b = 0; b < 3; b++) {
                sum += arr2D[b][a];
            }
            if (sum == 3) {
                System.out.println("Player X wins!");
                break;
            } else if (sum == -3) {
                System.out.println("Player O wins!");
                break;
            } else
                continue;
        }
        //check diagonal 1
        int sum1 = 0;
        for (int a = 0; a < 3; a++) {
            sum1 += arr2D[a][a];
            if (sum1 == 3) {
                System.out.println("Player X wins!");
                break;
            } else if (sum1 == -3) {
                System.out.println("Player O wins!");
                break;
            } else
                continue;
        }
        //check diagonal 2
        int sum2 = 0;
        for (int a = 2; a >= 0; a--) {
            sum2 += arr2D[a][-(a-2)];
            if (sum2 == 3) {
                System.out.println("Player X wins!");
                break;
            } else if (sum2 == -3) {
                System.out.println("Player O wins!");
                break;
            } else
                continue;
        }

    }




    }




