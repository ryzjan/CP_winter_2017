package pl.waw.sgh;
import java.util.*;

public class ImpTable {
    private static ImpTable instance;
    private Map<Integer,Integer> ptsMap =new HashMap<>();
    private NavigableSet<Integer> ptsSet;
    private ImpTable() {
        ptsMap.put(10, 0);
        ptsMap.put(40, 1);
        ptsMap.put(80, 2);
        ptsMap.put(120, 3);
        ptsMap.put(160, 4);
        ptsMap.put(210, 5);
        ptsMap.put(260, 6);
        ptsMap.put(310, 7);
        ptsMap.put(360, 8);
        ptsMap.put(420, 9);
        ptsMap.put(490, 10);
        ptsMap.put(590, 11);
        ptsMap.put(740, 12);
        ptsMap.put(890, 13);
        ptsMap.put(1090, 14);
        ptsMap.put(1220, 15);
        ptsMap.put(1490, 16);
        ptsMap.put(1740, 17);
        ptsMap.put(1990, 18);
        ptsMap.put(2240, 19);
        ptsMap.put(2490, 20);
        ptsMap.put(2990, 21);
        ptsMap.put(3490, 22);
        ptsMap.put(3990, 23);
        ptsMap.put(10000, 24);
        ptsSet = new TreeSet<>(ptsMap.keySet());
    }

    public static ImpTable getInstance() {
        if (instance==null) instance=new ImpTable();
        return instance;
    }

    public static void printTable() {
        Map<Integer, Integer> map = ImpTable.getInstance().getPtsMap();
        SortedSet<Integer> ptsMapSet = new TreeSet<>(map.keySet());
        int prev = 0;
        for (Integer key : ptsMapSet) {
            System.out.println(map.get(key) + " imp " + (prev > 0 ? prev + 10 : 0) + "-" + key);
            prev = key;
        }
    }
    public int getImpPoints(int points) {
        Integer key = ptsSet.ceiling(points);
        return ptsMap.get(key);
    }


    public Map<Integer, Integer> getPtsMap() {
        return ptsMap;
    }

    }



