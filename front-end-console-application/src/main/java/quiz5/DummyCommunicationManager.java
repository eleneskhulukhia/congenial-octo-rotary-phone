package quiz5;

import java.util.List;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendMessage(String message, List<String> chatHistory) {
        // Replace with actual REST API call implementation
        return "Response from dummy service";
    }
}
