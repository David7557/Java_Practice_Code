package array;

public class SmallestElement {
    static int getSmallest(int[] arr){
        int small = Integer.MAX_VALUE;
        for(int i: arr){
            if(small > i){
                small = i;
            }
        }

        return small;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1};
        int smallest = getSmallest(arr);
        System.out.println(smallest);
    }
}
