package app;

import quiz5.CommunicationManager;
import quiz5.DummyCommunicationManager;

public class Main {
    public static void main(String[] args) {
        // For testing purposes, use DummyCommunicationManager
        CommunicationManager communicationManager = new DummyCommunicationManager();
        UserInteractionManager userInteractionManager = new UserInteractionManager(communicationManager);

        // Start the chat
        userInteractionManager.startChat();
    }
}
