package algorithms;

public class Linear_Search {
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i ++){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {12, 34, 45, 56, 67, 78, 89, 90, 11, 12, 23, 34, 45, 56, 67, 78, 89};
        int key = 45;
        int index = linearSearch(array, key);

        if (index > 0){
            System.out.println("Element found at index of "+index);
        }else {
            System.out.println("Element not found");
        }
    }
}
