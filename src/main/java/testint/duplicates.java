package testint;

import java.util.HashSet;
import java.util.Set;

public class duplicates extends one{

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};

        Set<String> st = new HashSet<>();
        Set<String> dup = new HashSet<>();

        for(String s : arr){
            if(!st.add(s)){
            dup.add(s);
            }
        }
        System.out.println(dup);
    }
}
