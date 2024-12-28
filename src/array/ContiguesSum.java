package array;

public class ContiguesSum {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,6};
        int[] sumOfCont = new int[arr.length -1];

        int i = 0, j = 1, k = 0;
        while(i < arr.length && j < arr.length){
            sumOfCont[k++] = arr[i++] + arr[j++];
        }

        System.out.println(java.util.Arrays.toString(sumOfCont));
    }
}
