package array;

import java.util.Arrays;

public class MergeTwoArray {
    static int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int arr2Start = 0;
        for(int i =0; i < arr.length;i++){
            if(i < arr1.length){
                arr[i] = arr1[i];
            }else {
                arr[i] = arr2[arr2Start++];
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};

        int[] arr = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}
