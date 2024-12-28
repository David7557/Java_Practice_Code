package array;

import java.util.Arrays;

public class DoubleOfArray {

    static int[] getDouble(int[] arr){
        int[] doubleArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            doubleArray[i] = arr[i]*2;
        }

        return doubleArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] doubleArray = getDouble(arr);
        System.out.println(Arrays.toString(doubleArray));
    }
}
