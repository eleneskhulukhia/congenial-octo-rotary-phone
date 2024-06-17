package quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionManager {
    private CommunicationManager communicationManager;

    public UserInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
    }

    public void startConversation() {
        Scanner scanner = new Scanner(System.in);
        List<String> conversationHistory = new ArrayList<>();

        while (true) {
            System.out.print("User: ");
            String userInput = scanner.nextLine();
            conversationHistory.add(userInput);

            String response = communicationManager.sendRequest(userInput, conversationHistory);
            System.out.println("Chatbot: " + response);
        }
    }
}