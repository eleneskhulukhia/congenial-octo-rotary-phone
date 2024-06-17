package quiz6;

import java.util.List;

public class SpecialCommunicationManager {
    private String commonServiceUrl;
    private String specialServiceUrl;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
    }

    public String sendRequest(String message, List<String> conversationHistory) {
        if (message.contains("help") || containsHelpInHistory(conversationHistory)) {
            // Send request to special service
            return sendRequestToSpecialService(message, conversationHistory);
        } else {
            // Send request to common service
            return sendRequestToCommonService(message, conversationHistory);
        }
    }

    private boolean containsHelpInHistory(List<String> conversationHistory) {
        for (String msg : conversationHistory) {
            if (msg.contains("help")) {
                return true;
            }
        }
        return false;
    }

    private String sendRequestToCommonService(String message, List<String> conversationHistory) {
        // Implement sending request to common service
        return "Response from common service";
    }

    private String sendRequestToSpecialService(String message, List<String> conversationHistory) {
        // Implement sending request to special service
        return "Response from special service";
    }
}