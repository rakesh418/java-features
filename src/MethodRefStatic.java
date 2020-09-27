interface Sayable{
    void say();
}

public class MethodRefStatic {

    public static void saySomething(){
        System.out.println("Hello, This is static method");
    }

    public static void main(String[] args) {
//        Sayable sayable = ()->saySomething();
        Sayable sayable = MethodRefStatic::saySomething;
        sayable.say();
    }
}
