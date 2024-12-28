package javaframeworks;

public class StringTest {
    String name;
   /* public String toString(){
        return "Ganja";
    }*/

    StringTest(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof StringTest){
            StringTest s = (StringTest) obj;
            return this.name == s.name;
        }
        return false;
    }

    public static void main(String[] args){
        StringTest s1 = new StringTest("David");
        StringTest s2 = new StringTest("David");

        System.out.println(s1.equals(s2));

    }
}
