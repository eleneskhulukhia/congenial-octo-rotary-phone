package quiz5;

import java.util.List;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendRequest(String message, List<String> conversationHistory) {
        // Simulate a response from the chatbot service
        return "Dummy Response";
    }
}