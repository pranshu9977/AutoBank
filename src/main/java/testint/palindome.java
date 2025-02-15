package testint;

import java.util.Arrays;

public class palindome {

    public static void main(String[] args) {
         String s = "asdfghjkljkllkjhgfdsa";
         char c;
         String rev = "";

        for (int i =0; i<=s.length()-1; i++) {
            c = s.charAt(i);
            rev = c + rev;
        }
        if (s.equals(rev));
        System.out.println("palinderome");
    }
}
