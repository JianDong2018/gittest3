package Arithmetic;

/**
 * Created by w on 2018/8/22
 */
class Parent{
    private String p ="parent";
    private static String sp="s parent";
    public void method(){
        System.out.println(p);
    }
    public static void smethod(){
        System.out.println(sp);
    }
}

class Child extends Parent{
    private String c ="child";
    private static String sc="s child";
    public void method(){
        System.out.println(c);
    }
    public static void smethod(){
        System.out.println(sc);
    }
}
public class T {
    public static void main(String[] args) {
        Child c = new Child();
        Parent parent =  c;
        parent.method();
        parent.smethod();
    }
}
