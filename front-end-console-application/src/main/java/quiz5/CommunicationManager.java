package quiz5;

import java.util.List;

public interface CommunicationManager {
    String sendRequest(String message, List<String> conversationHistory);
}