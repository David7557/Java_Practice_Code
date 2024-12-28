package problemsolving;

public class PrimeNumber {

    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }

        int count = 0;
        for(int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {
        int num = 5;
        boolean b = isPrime(5);

        if(b){
            System.out.println(num+ " is a prime number");
        }else {
            System.out.println("not a prime");
        }
    }
}
