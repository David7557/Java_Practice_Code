package array;

public class SecondLargest {

    static int getSecondLargest(int[] arr){
        int biggest = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(biggest < i){
                biggest = i;
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int i : arr){
            if(secondLargest < i && i < biggest){
                secondLargest = i;
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int secondLargest = getSecondLargest(arr);
        System.out.println(secondLargest);
    }
}
