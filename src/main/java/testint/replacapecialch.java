package testint;

public class replacapecialch {
    public static void main(String[] args) {
        String d= "GHASK!~#$%&5834";
        String ch = d.replaceAll("[^A-Z]", "" );
        System.out.println(ch);
    }
}
