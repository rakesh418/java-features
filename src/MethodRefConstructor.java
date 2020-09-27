interface Messageable1{
    Message getMessage(String msg);
}

class Message{
    Message(String msg){
        System.out.println(msg);
    }
}

public class MethodRefConstructor {
    public static void main(String[] args) {
        Messageable1 hello = Message::new;
        hello.getMessage("Hello");
    }
}
