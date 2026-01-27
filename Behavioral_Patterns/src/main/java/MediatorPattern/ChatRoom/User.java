package MediatorPattern.ChatRoom;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage (String message) {
        chatMediator.sendMessage(this,message);
    }

    public void receiveMessage (String message) {
        System.out.println(name + " isimli kullanıcı mesajı aldı : " + message);
    }

}
