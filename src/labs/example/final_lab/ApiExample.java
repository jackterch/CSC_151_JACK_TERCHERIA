// name: jack tercheria
// date: 5/5/2025
// description: api example google gemini

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class ApiExample {

    private static final String API_KEY = System.getenv("AIzaSyBfa6d4hGuhS2JUsfkI4JZqY4TJF-_25ek");
    private static final String MODEL_NAME = "gemini-2.0-flash";
    private static final String API_URL = String.format("https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=AIzaSyBfa6d4hGuhS2JUsfkI4JZqY4TJF-_25ek");

    public static void main(String[] args) throws Exception{
        try {

            int i = 1;
            System.out.println("Google Gemini 2.0 Chatbot -- MAX 3 QUESTIONS");
            System.out.println("----------------------------------------");

             // String jsonInputString = "{'candidates': \n, 'contents': \n, 'parts': \n, 'text': 'Explain what chocoloate tastes like'}";
            while (i <= 3)
            {

                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Enter your question: ");
                String question = scanner.nextLine();


                String jsonInputString = "{\r\n" + //
                                    "    contents: [\r\n" + //
                                    "      {\r\n" + //
                                    "        parts: [\r\n" + //
                                    "          { text: \"" + question + "\" },\r\n" + //
                                    "        ],\r\n" + //
                                    "      },\r\n" + //
                                    "    ],\r\n" + //
                                    "  }";

                URL obj = new URI(API_URL).toURL();

                HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

                connection.setRequestMethod("POST");
                connection.setRequestProperty("User-Agent", "Java App");
                connection.setRequestProperty("Content-Type", "application/json");

                connection.setDoOutput(true);

                try(OutputStream os = connection.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);			
                }
                

                int responseCode = connection.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Read response body
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    // Print response body
                    int startIndex = response.indexOf("\"text\": \"");
                    
                    if (startIndex != -1) {
                        startIndex += 9;
                        int endIndex = response.indexOf("\"", startIndex);
                        if (endIndex != -1) {
                            System.out.println("API RESPONSE");
                            System.out.println(response.substring(startIndex, endIndex));
                        }
                    }
                    // System.out.println("Response Body: " + response.toString());
                } else {
                    System.out.println("Request failed with response code: " + responseCode);
                }
                connection.disconnect();
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        

        
    }
}