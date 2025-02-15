package testint;
import java.util.LinkedHashMap;
import java.util.Map;

public class arraylst {
    public static void main(String[] args) {
        String s = "My name is pranshu and I call my name as pranshu";
        String sss = s.toLowerCase();
        char [] ss = sss.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: ss){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println( entry.getKey() + "   is the occurance of " + entry.getValue());
        }
    }
}
