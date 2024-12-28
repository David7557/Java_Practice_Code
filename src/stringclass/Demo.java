package stringclass;

public class Demo {

    @Override
    public String toString(){
        return "David@2002";
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.toString());
        System.out.println(d);
    }
}
