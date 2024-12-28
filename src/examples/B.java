package examples;

class B {
    B a;
    int s;
    String st;

    B(int s, String st){
        this.s = s;
        this.st = st;
    }
    B(B a){
        this.a = a;

    }

    public static void main(String[] args){
        B a = new B(new B(10, "you"));
        a.s = 10;
        a.st = "Hii";
        System.out.println(a.s);
        System.out.println(a.st);
        System.out.println(a.a);

    }

}