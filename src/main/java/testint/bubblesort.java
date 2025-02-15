package testint;

import java.util.Arrays;
import java.util.Collections;

public class bubblesort {

    static int ar[] ;
    bubblesort(int ar[]){
        this.ar = ar;
    }
    public void aeer(){
        for (int i = 0; i< ar.length-1; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] <  ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

    }


    public static void main(String[] args) {
    bubblesort bb = new bubblesort(new int[]{1, 2, 3, 4, 5, 67,});
    bb.aeer();
    }


}
