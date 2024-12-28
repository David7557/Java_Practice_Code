package array;

public class EvenOddCount {
    static int[] getEvenOddCount(int[] arr){
       int[] count = new int[2];
        int evenCount = 0;
        int oddCount = 0;
        for(int i : arr){
            if(i%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        count[0] = evenCount;
        count[1] = oddCount;
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] count = getEvenOddCount(arr);
        System.out.println("Even count: "+count[0]);
        System.out.println("Odd count: "+count[1]);
    }
}
