interface Sayable{
    void say();
}

public class MethodRefStatic {

    public static void saySomething(){
        System.out.println("Hello, This is static method");
    }

    public static void threadStatus(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
//        Sayable sayable = ()->saySomething();
        Sayable sayable = MethodRefStatic::saySomething;
        sayable.say();

        Thread t2 = new Thread(MethodRefStatic::threadStatus);
        t2.start();

    }
}
