package array;

public class FrequencyOfElement {
    static void getFrequency(int[] arr){
        boolean[] b = new boolean[arr.length];
       for(int i =0; i < arr.length; i++){
           if(b[i] == false){
               int count = 1;
               for(int j = 0; j < arr.length; j++) {
                   if(arr[i] == arr[j]){
                       count++;
                       b[j] = true;
                   }
               }
               System.out.println(arr[i]+" ---> "+ count);
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 2, 3, 4, 5, 6, 6, 3, 5, 7};
        getFrequency(arr);
    }
}
