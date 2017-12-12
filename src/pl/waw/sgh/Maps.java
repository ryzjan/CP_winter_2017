package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> myMap=new HashMap<>();
        myMap.put("Anna",4);
        myMap.put("Tom",3);
        myMap.put("Chris",10);

        int s=0;
        for (String key:myMap.keySet()){
            System.out.println(key+"="+myMap.get(key));
            s+=myMap.get(key);
        }
        System.out.println("Sum: "+s);
        s=0;
        for(Integer val:myMap.values()){
            s+=val;

        }
        System.out.println("Sum: "+s);

    }
}
