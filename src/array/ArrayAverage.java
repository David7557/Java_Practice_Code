package array;

public class ArrayAverage {
    static double getAverage(int[] arr){
        int sum = ArraySum.getSum(arr);
        int numDigit = arr.length;

        return (double) sum /numDigit;
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        double arrayAverage = getAverage(arr);
        System.out.print(arrayAverage);
    }
}
