package algorithms;

import java.util.Arrays;

public class Sort {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        sort(array);
    }
}
