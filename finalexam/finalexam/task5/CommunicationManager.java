package finalexam.task5;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommunicationManager {

    private String endpoint;

    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
    }

    public String sendUserMessage(String message) {
        try {
            // Create a URL object with the endpoint
            URL url = new URL(endpoint);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Set the request property for content type
            connection.setRequestProperty("Content-Type", "application/json; utf-8");

            // Set the request property for the expected response format
            connection.setRequestProperty("Accept", "application/json");

            // Enable the connection to send output
            connection.setDoOutput(true);

            // Create the JSON payload
            String jsonInputString = "{\"message\": \"" + message + "\"}";

            // Write the JSON input string to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code to determine success
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                return "Message sent successfully!";
            } else {
                return "Failed to send message. Response code: " + responseCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred: " + e.getMessage();
        }
    }
}

