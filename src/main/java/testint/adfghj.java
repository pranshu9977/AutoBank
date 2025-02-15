package testint;

import java.util.Arrays;

class cls{
public static void main(String[]args) {
    int[] ar = {1, 1, 2, 4, 5, 74, 5, 7};
    int max = ar[0];
    for(int i = 0; i<ar.length; i++){
        if(max<ar[i]){
            max = ar[i];
        }
    }
    System.out.println(max);
    System.out.println(ar[ar.length-1]);
}
        }


