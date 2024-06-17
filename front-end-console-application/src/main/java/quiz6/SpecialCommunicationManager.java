package quiz6;

import java.util.List;

public class SpecialCommunicationManager implements CommunicationManager {
    private String commonServiceUrl;
    private String specialServiceUrl;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
    }

    @Override
    public String sendMessage(String message, List<String> chatHistory) {
        // Check if message or chat history contains "help" to decide which service to call
        if (message.toLowerCase().contains("help") || chatHistory.stream().anyMatch(msg -> msg.toLowerCase().contains("help"))) {
            // Call special service
            return callService(specialServiceUrl, message, chatHistory);
        } else {
            // Call common service
            return callService(commonServiceUrl, message, chatHistory);
        }
    }

    private String callService(String url, String message, List<String> chatHistory) {
        // Implement REST API call here
        // Construct JSON request using message and chatHistory
        // Send POST request to `url` and get response
        return "Response from service at " + url;
    }
}
