package array;

import java.util.Arrays;

public class Sorting {
    static void sort(int[] x){
        for (int i = 0; i< x.length; i++){
            for (int j =0; j < x.length; j++){
                if (x[i] < x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));

    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        sort(arr);
    }
}
