package problemsolving;

public class PallindromeNumber{

    public static void isPallindrome(int num){
        int temp = num;

        int palnum = 0;
        while(num > 0){
            int i =  num % 10;
            palnum = palnum * 10 + i;
            num /= 10;

        }
        if (temp == palnum){
            System.out.println("Palindrome!!");
        }else {
            System.out.println("not a palindrome!!");
        }
    }
    
    public static void main(String[] args) {
        isPallindrome(787);
    }
}
