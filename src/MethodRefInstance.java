interface Messageable{
    void say();
}

public class MethodRefInstance {
    public void message(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new MethodRefInstance()::message);
        t2.start();
    }
}
