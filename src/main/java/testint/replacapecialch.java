package testint;

public class replacapecialch {
    public static void main(String[] args) {
        String d= "GHASK!~#$%&5834";
        String ch = d.replaceAll("[^a-zA-Z0-9]", " " );
        System.out.println(ch);
    }
}
