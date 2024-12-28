package array;

public class PrimeCount {

    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }

        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count == 2;
    }

    static int getPrimeCount(int[] arr){
        int countPrime = 0;
      for (int i = 0; i < arr.length; i++){
          if(isPrime(arr[i])){
              countPrime++;
          }
      }
      return countPrime;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9, 10, 11};
        int count = getPrimeCount(arr);
        System.out.println("Prime count is : "+count);
    }
}
