package stringclass;

public interface IButton {
    public static void main(String[] args) {
        IButton ib = new IButton() {
            @Override
            public String toString(){
                return "David";
            }

        };
        System.out.println(ib);

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("hee");
        }
    }
}
