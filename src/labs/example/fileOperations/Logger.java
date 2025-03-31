import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Logger {

    private static final String FILE_PATH = "C:\\Users\\Jack\\CSC_151_JACK_TERCHERIA\\src\\labs\\example\\fileOperations";
    
    private static final String ERROR_LOG_FILE = FILE_PATH + "\\logs\\api_error.log";

    public static void main() {
        openErrorLog();
    }

    public static void openErrorLog() {
        File log_file = new File(ERROR_LOG_FILE);

        try {
            String message="";
            String line="";
            int infoError = 0;
            int errorError = 0;
            int warnError = 0;
            int debugError = 0;
            int memoryErrorCount = 0;            
            int count = 0;
            int grade = 0;
            int avg = 0;
            

            if(log_file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(log_file));



                while((line = br.readLine()) != null) {
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
                        if (values[2].equals("[DEBIG]")) {
                            debugError++;
                        }
                        if (values[5].equals("Memory")) {
                            memoryErrorCount++;
                            System.out.println("The count of memmory errors are: " + memoryErrorCount + " " + values[12] + " " + values[13]);
                        }
                    }
                    count++;
                }

                System.out.println("Total [INFO] errors: " + infoError);
                System.out.println("Total [ERROR] errors: " + errorError);
                System.out.println("Total [WARN] errors: " + warnError);
                System.out.println("Total [DEBUG] error: " + debugError);
            

            br.close();
            }
        }
        catch(IOException e) {
            System.err.println("There was error processing the file");
        }
    }
}
