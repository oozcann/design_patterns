package MediatorPattern.ChatRoom;

public interface ChatMediator {
    void sendMessage(User user,String message);
    void addUser(User user);
}
