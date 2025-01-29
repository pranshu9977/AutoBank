package testint;

public class reverse {
    public static void main(String[] args) {
        String p = "123456789";
        char[] pp = p.toCharArray();
        // using the while loop
        char temp;
        int right = p.length() - 1;
        int left = 0;
        String rev = "";
        while (left < right) {
            temp = pp[left];
            pp[left] = pp[right];
            pp[right] = temp;
            left++;
            right--;
        }
        //using the for loop
        for (int i =0; i<= p.length()-1; i++){
            char tem = p.charAt(i);
            rev = tem + rev;
        }
        //using String Builder
        StringBuilder sb = new StringBuilder(p);
        //Using String Buffer
        StringBuffer sbf = new StringBuffer(p);

        System.out.println(p);
        System.out.println(pp);
        System.out.println(rev);
        System.out.println(sb.reverse());
        System.out.println(sbf.reverse());
    }
}
