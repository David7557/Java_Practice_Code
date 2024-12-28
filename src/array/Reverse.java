package array;

import java.util.Arrays;
public class Reverse {
    static int[] reverse(int[] arr){
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i = arr.length-1; i >= 0; i--){
            arr1[j++] = arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] reverseArray = reverse(arr);
        System.out.println(Arrays.toString(reverseArray));
    }
}
