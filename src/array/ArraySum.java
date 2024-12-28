package array;

public class ArraySum {
    static int getSum(int[] arr){
        int sum =0;
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr= {12,23, 34, 45, 56, 67, 78, 89, 90};
        int sum = getSum(arr);
        System.out.println("Array sum is: "+sum);
    }
}
