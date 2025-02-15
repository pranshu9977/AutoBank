package testint;

import javax.xml.stream.events.Characters;
import java.util.*;

public class removeVovels {

    public static void main(String[] args) {
        String name = "PRanshuuuuuuuuuuuuuuuuuuuuuuuu";
        char[] ss = name.toLowerCase().toCharArray();
        String vov = "aeiou";
        char []vovels = vov.toCharArray();
        List<Character> l1 = new ArrayList<>();
        for(char c1 : ss){
            l1.add(c1);
        }
        List<Character> l2 = new ArrayList<>();
        for (char c2: vovels){
            l2.add(c2);
        }

        l1.retainAll(l2);
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : l1){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(l1);
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "     as a vovel     "+ entry.getValue());
        }
    }
}
