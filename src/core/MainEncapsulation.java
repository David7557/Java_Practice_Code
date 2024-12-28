package core;

public class MainEncapsulation {
    public static void main(String[] args) {
        JavaBeanClass jb = new JavaBeanClass();
        jb.setName("David");
        jb.setAge(22);

        System.out.println(jb.getName());
        System.out.println(jb.getAge());
    }
}
