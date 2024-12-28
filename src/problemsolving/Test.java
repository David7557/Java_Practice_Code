package problemsolving;

public class Test {
    public static  int calculateSum(String str) {
           int sum=0;

        for (int i =0;i<str.length();i++) {
            int current = 0;
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                current = current * 10 + (ch - '0');
            }
            sum = sum + current;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "12abc34 abs";
        int result = calculateSum(str);
        System.out.println(result);
    }

}
