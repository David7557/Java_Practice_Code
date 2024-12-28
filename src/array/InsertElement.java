package array;

import java.util.Arrays;

public class InsertElement {
    static int[] insertElement(int[] x, int[] y, int index){
        if(index < 0 || index > x.length){
            return x;
        }
        int[] z = new int[x.length+y.length];
        for(int i = 0; i<y.length; i++){
            z[index+i] = y[i];
        }
        for(int i = 0; i < x.length; i++){
            if(i < index){
                z[i] = x[i];
            }else {
                z[i + y.length] = x[i];
            }
        }

        return z;
    }
    public static void main(String[] args) {
        int[] arr1 = {23, 56, 78, 89, 32, 48};
        int[] arr2 = {38, 48, 28};

        int[] arr = insertElement(arr1, arr2, 2);
        System.out.println(Arrays.toString(arr));
    }
}
