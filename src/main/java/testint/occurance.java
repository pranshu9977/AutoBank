package testint;

import java.util.HashMap;
import java.util.Map;

public class occurance {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,12,3,1,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a){
            map.put(i, map.getOrDefault(i,0)+1);

        }
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(" num " + entry.getKey() + " is occuring " + entry.getValue());
            }




    }
}
