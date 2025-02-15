package testint;

public class testsssss {

    public static void main(String[] args) {
        String s = "My name is pranshu and I call my name as pranshu";
        //char [] ss = s.toCharArray();
        String rev = "";
        for(int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            rev = temp + rev;
        }

        System.out.println(rev);

    }

}
