package ua.edu.ucu.task1;

public class MessageSender {

    public void send(User user, String text){
        System.out.println("Send message to: "+user);
        System.out.println("Message content: "+text);
    }
}
