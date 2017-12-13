package pl.waw.sgh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;


public class CalculateChange {
    public static void main(String[] args) throws IOException {


        File folder = new File("/home/jas/CP");
        File[] listOfFiles = folder.listFiles();

        //double[][] arr = new double[22][2];

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {

                Scanner scan0 = new Scanner(listOfFiles[i]);
                int l=0;
                while (scan0.hasNext()) {
                    String row = scan0.nextLine();
                    l++;
                }
                //defines array of appropriate number of rows (without headers):
                double[][] arr = new double[(l-1)][2];
                System.out.println("File " + listOfFiles[i].getName());
                Scanner scan = new Scanner(listOfFiles[i]);
                int k = 0;
                while (scan.hasNext()) {
                    String row = scan.nextLine();
                    String[] elem = row.split(",");
                    int j = 0;
                    //with exception of headers:
                    if (k>0){
                    for (String el : elem) {

                        if (j == 1) {
                            arr[k-1][0] = Double.parseDouble(el);
                        }
                        if (j == 4) {
                            arr[k-1][1] = Double.parseDouble(el);
                        }
                        j++;
                    }

                    }

                    k++;
                }




            }

            else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());

            }
        }
    }
}




