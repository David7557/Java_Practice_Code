package examples;



class Example extends Demo{
    @Override
    void absMethod(){
        System.out.println("Override");
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.absMethod();
    }

}