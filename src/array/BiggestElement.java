package array;

public class BiggestElement {

    static int getBiggest(int[] arr){
        int big = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }

        return big;
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90, 100};
        int biggest = getBiggest(arr);
        System.out.println(biggest);
    }
}
