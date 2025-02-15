package testint;

public class maxNum {
    public static void main(String[] args) {
        int[] ar = {1, 2, 1, 3, 5, 4, 8, 9, 6, 4, 7, 5, 2};
        int max = ar[0];

        for (int i = 0; i <= ar.length - 1; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println(max);

    }}