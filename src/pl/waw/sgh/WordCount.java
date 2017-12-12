package pl.waw.sgh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class WordCount {

    static final String FILE_LOC="/home/jas/c20171212";

    public static void main(String[] args)throws FileNotFoundException {
        Map<String, Integer> wordMap = new HashMap<>();
        File wordFile = new File(FILE_LOC);
        Scanner wordScanner = new Scanner(wordFile);
        while (wordScanner.hasNext()) {
            String wordLine = wordScanner.nextLine();
            //Found a way to set more than one "splitting" symbol (use of "[...]"), because the analysis was unsuccessful:
            String[] word = wordLine.split("[,.:“”() ]");
            for (String wo : word) {

                if (!wordMap.containsKey(wo))
                    wordMap.put(wo, 1);
                else
                    wordMap.put(wo, (wordMap.get(wo) + 1));


            }
        }
        System.out.println("Statistics of words in file "+FILE_LOC);
        for (String key : wordMap.keySet()) {
            System.out.println("Word " + key + " appears " + wordMap.get(key) + " times");
        }
    }
}
