package testint;

import java.util.Arrays;
import java.util.Scanner;

class passcode {

    public boolean password(String pass) {

        if (pass.length() < 6 || pass.length() > 20) {
            return false;
        }
        char[] pss = pass.toCharArray();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasdig = false;

        for (int i = 0; i < pss.length; i++) {

            char ch = pass.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;

            if(i >=2 && pss[i] == pss[i-1] && pss[i] == pss[i-2]){
                return false;
            }
        }

        return hasUpper && hasdig && hasdig;
    }
}
public class pasww {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the password");
        passcode ps = new passcode();
        if (scan.hasNextLine()) {
           //boolean psww = ps.password(scan.nextLine());
            String s = scan.nextLine();
            if(ps.password(s)){
                System.out.println(s + "is a strong pass");
            }
            else {
                System.out.println(s + "is invalid");

            }
        }
    }
}
