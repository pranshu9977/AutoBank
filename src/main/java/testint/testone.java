package testint;

public class testone {

    public static void main(String[] args) {
//How do you find the second largest number in an array in Java?
        int [] arr = {1,2,3,4,9,7,3};
        int max = arr[0];
        int second ;
        for(int i = 0; i< arr.length-1; i++){

            if(max < arr[i]) {
             second =  max;
             max = arr[i];
             arr[i] = second;
            }
        }

//


    }
}
