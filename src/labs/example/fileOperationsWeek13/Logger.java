import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Logger {

    private static final String FILE_PATH = "C:\\Users\\Jack\\CSC_151_JACK_TERCHERIA\\src\\labs\\example\\fileOperations";
    
    private static final String ERROR_LOG_FILE = FILE_PATH + "\\logs\\api_error.log";


    public static void main(String[] args) {
        openErrorLog();

        String log_file = ERROR_LOG_FILE;

        try (BufferedReader file = new BufferedReader(new FileReader(log_file))) {
            getCountOfErrorTypes(file);
            

            // Use the BufferedReader object
        } catch (IOException e) {
            // Handle exception
        }

        try (BufferedReader file = new BufferedReader(new FileReader(log_file))) {
            getMemoryLimitExceededCount(file);
            

            // Use the BufferedReader object
        } catch (IOException e) {
            // Handle exception
        }

        

    }

    public static void openErrorLog() {
        String filePath = FILE_PATH + "\\logs\\api_error.log";
        File log_file = new File(filePath);

    }

    public static void getCountOfErrorTypes(BufferedReader file) {
        try {
            String line = "";

            int infoError = 0;
            int errorError = 0;
            int warnError = 0;
            int debugError = 0;           
            int count = 0;
            int grade = 0;
            int avg = 0;

            while ((line = file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    if (values[2].equals("[INFO]")) {
                        infoError++;
                    }
                    if (values[2].equals("[ERROR]")) {
                        errorError++;
                    }
                    if (values[2].equals("[WARN]")) {
                        warnError++;
                    }
                    if (values[2].equals("[DEBUG]")) {
                        debugError++;
                    }
                }
                count++;
            }
            System.out.println("Total [INFO] errors: " + infoError);
            System.out.println("Total [ERROR] errors: " + errorError);
            System.out.println("Total [WARN] errors: " + warnError);
            System.out.println("Total [DEBUG] errors: " + debugError);
        } catch (Exception e) {

        }
    }

    public static void getMemoryLimitExceededCount(BufferedReader file) {
        try {
            String line = "";

            int memoryErrorCount = 0; 
            int count = 0;
            while ((line = file.readLine()) != null) {
            if (count > 0) {
                String[] values = line.split(" ");
                if (values[5].equals("Memory")) {
                    memoryErrorCount++;
                    System.out.println("The count of memmory errors are: " + memoryErrorCount + " " + values[12] + " " + values[13]);
                }
            }
            count++;
        }

        } 
        catch (Exception e) {
        }
    }

}
