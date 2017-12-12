package pl.waw.sgh;
import java.util.*;
import java.util.Arrays;
public class ListsAndSets {

    public static void printCollection(Collection collection) {
        for(Object setE1:collection){
            System.out.println(setE1);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("abc");
        myList.add("cde");
        myList.add(0,"def");
        myList.add("def");
        System.out.println("2nd element is: "+myList.get(1));
        printCollection(myList);
        //Arrays.
        Collections.sort(myList);
        printCollection(myList);

        Set<Integer>mySet=new HashSet<>();
        mySet.add(713);
        mySet.add(345);
        mySet.add(777);
        mySet.add(123);
        printCollection(mySet);

        Set<Integer>mySortedSet=new TreeSet<>();
        mySortedSet.addAll(mySet);
        printCollection(mySortedSet);

    }
}
