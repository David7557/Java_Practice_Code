package algorithms;

public class Binary_Search{

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if (key == arr[mid]){
                return mid;
            } else if (key < arr[mid]) {
                start = 0;
                end = mid - 1;
            }else {
                start = mid + 1;
                end = arr.length-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] array = {5,9,17,23,25,45,59,63,71,89};
       int key = 59;
       int index = binarySearch(array, key);
        System.out.println("Element found at index of "+index);
    }
}
