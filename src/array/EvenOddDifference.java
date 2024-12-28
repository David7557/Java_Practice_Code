package array;

public class EvenOddDifference {
    static int getDifference(int[] arr){
        int sumofEven = 0;
        int sumOfOdd = 0;

        for (int i : arr){
            if(i % 2 == 0){
                sumofEven += i;
            }else {
                sumOfOdd += i;
            }
        }
        /*System.out.println(sumofEven);
        System.out.println(sumOfOdd);*/
        return (int) sumofEven - sumOfOdd;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int difference = getDifference(arr);
        System.out.println("Difference between Even and Odd is : "+ difference);
    }
}
