package quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionManager {
    private CommunicationManager communicationManager;
    private List<String> chatHistory;

    public UserInteractionManager() {
        this.communicationManager = new DummyCommunicationManager(); // Replace with actual implementation later
        this.chatHistory = new ArrayList<>();
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("User: ");
            String userMessage = scanner.nextLine();
            chatHistory.add(userMessage);

            String response = communicationManager.sendMessage(userMessage, chatHistory);
            System.out.println("Chatbot: " + response);
        }
    }

    public static void main(String[] args) {
        UserInteractionManager manager = new UserInteractionManager();
        manager.startChat();
    }
}
