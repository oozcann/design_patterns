package MediatorPattern.ChatRoom;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom1 = new ChatRoom();
        User user11 = new User("Ali - ChatRoom1", chatRoom1);
        User user12 = new User("Veli - ChatRoom1", chatRoom1);
        User user13 = new User("Ahmet - ChatRoom1", chatRoom1);
        User user14 = new User("Mehmet - ChatRoom1", chatRoom1);

        chatRoom1.addUser(user11);
        chatRoom1.addUser(user12);
        chatRoom1.addUser(user13);
        chatRoom1.addUser(user14);

        ChatRoom chatRoom2 = new ChatRoom();
        User user21 = new User("Ali - ChatRoom2", chatRoom2);
        User user22 = new User("Veli - ChatRoom2", chatRoom2);
        User user23 = new User("Ahmet - ChatRoom2", chatRoom2);
        User user24 = new User("Mehmet - ChatRoom2", chatRoom2);

        chatRoom2.addUser(user21);
        chatRoom2.addUser(user22);
        chatRoom2.addUser(user23);
        chatRoom2.addUser(user24);

        user11.sendMessage("ABC");
        user12.sendMessage("CBA");

        user21.sendMessage("DEF");
        user23.sendMessage("FED");


    }
}
