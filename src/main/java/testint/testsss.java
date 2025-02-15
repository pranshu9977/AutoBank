package testint;
import java.util.Scanner;

class password {
    public boolean passStreangth() {
//    It has at least 6 characters and at most 20 characters.
//    It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
//    It does not contain three repeating characters in a row
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        char[] aRRy = s.toCharArray();

        if (s.length() <= 6 || s.length() >= 20) {

            return true;
        }
        if (s.contains("[A-Z]")) {
            return true;
        }

        if (s.contains("[a-z]")) {
            return false;
        }
        return false;
    }
}
public class testsss {
    public static void main(String[] args) {

    }

}