import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Logger {

    private static final String FILE_PATH = "C:\\Users\\Jack\\CSC_151_JACK_TERCHERIA\\src\\labs\\example\\fileOperationsWeek13";
    
    private static final String ERROR_LOG_FILE = FILE_PATH + "\\logs\\api_error.log";

    private static final String HTTP_ACCESS_LOG = FILE_PATH + "\\logs\\http_access.log";


    public static void main(String[] args) {
        openErrorLog();

        String log_file = ERROR_LOG_FILE;

        String http_access = HTTP_ACCESS_LOG;

        /* 
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
        */

        try (BufferedReader file = new BufferedReader(new FileReader(log_file))) {
            getDiskSpaceErrorsWithIPAddress(file);
            

            // Use the BufferedReader object
        } catch (IOException e) {
            // Handle exception
        }


        try (BufferedReader http_file = new BufferedReader(new FileReader(http_access))) {
            getGMTOffsetFile(http_file);
            
            // Use the BufferedReader object
        } catch (IOException e) {
            // Handle exception
        }

        try (BufferedReader http_file = new BufferedReader(new FileReader(http_access))) {
            getHTTPCodes(http_file);

        } catch (IOException e) {

        }

        try (BufferedReader http_file = new BufferedReader(new FileReader(http_access))) {
            getResponseSizes(http_file);

        } catch (IOException e) {

        }

        try (BufferedReader http_file = new BufferedReader(new FileReader(http_access))) {
            groupHTTPMethodsAndEndPoints(http_file);
        } catch (IOException e) {

        }
    }

    public static void openErrorLog() {
        String filePath = FILE_PATH + "\\logs\\api_error.log";
        File log_file = new File(filePath);

    }

    public static void openErrorLog(String http_access_log) {
        String access_log = HTTP_ACCESS_LOG;
    }

    
    /* 
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
    */

    /* 
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
    */

    public static void getDiskSpaceErrorsWithIPAddress(BufferedReader file) {
        try {
            String line = "";
            int diskSpaceCount = 0; 
            int count = 0;

            while ((line = file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    if (values[5].equals("Disk")) {
                        diskSpaceCount++;
                        System.out.println("Disk space error on line " + count + " for IP address: " + values[3]);
                    }
                }
                count++;
            }

            System.out.println("That is all...");
            
        } catch (Exception e) {
        }
    }

    public static void getGMTOffsetFile(BufferedReader http_file) {
        try {

            String line = "";
            int zeroErrorCount = 0; 
            int fiveErrorCount = 0;
            int count = 0;

            while ((line = http_file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    if (values[4].equals("+0000]")) {
                        zeroErrorCount++;
                    }
                }
                count++;
            }
            System.out.println("There is a +0000 error " + zeroErrorCount + " times");
            System.out.println("That is all...");
        } catch (Exception e) {
        }
    }

    public static void getHTTPCodes(BufferedReader http_file) {
        try {

            String line = "";
            int twoXXCount = 0; 
            int threeXXCount = 0;
            int fourXXCount = 0;
            int fiveXXCount = 0;
            int errorCode = 0;
            int count = 0;

            while ((line = http_file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    errorCode = Integer.parseInt(values[8]);
                    if (errorCode >= 200 && errorCode <= 299) {
                        twoXXCount++;
                    }
                    if (errorCode >= 300 && errorCode <= 399) {
                        threeXXCount++;
                    }
                    if (errorCode >= 400 && errorCode <= 499) {
                        fourXXCount++;
                    }
                    if (errorCode >= 500 && errorCode <= 599) {
                        fiveXXCount++;
                    }
                }
                count++;
            }
            System.out.println("There is a 2xx error " + twoXXCount + " times");
            System.out.println("There is a 3xx error " + threeXXCount + " times");
            System.out.println("There is a 4xx error " + fourXXCount + " times");
            System.out.println("There is a 5xx error " + fiveXXCount + " times");
            System.out.println("That is all...");
        } catch (Exception e) {

        }
    }

    public static void getResponseSizes(BufferedReader http_file) {
        try {
            String line = "";
            int responseSize = 0;
            int responseSizeCount = 0;
            int count = 0;

            while ((line = http_file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    responseSize = Integer.parseInt(values[9]);
                    if (responseSize > 3900) {
                        responseSizeCount++;
                    }
                }
                count++;
            }
            System.out.println("There are " + responseSizeCount + " errors that have a response size greater than 3900.");
            System.out.println("That is all...");
        } catch (Exception e) {

        }
    }

    public static void groupHTTPMethodsAndEndPoints(BufferedReader http_file) {
        try {
            String line = "";
            String Verb = "";
            String POST = "";
            String PUT = "";
            String DELETE = "";
            String PATCH = "";
            String GET = "";
            String OPTIONS = "";
            int count = 0;

            while ((line = http_file.readLine()) != null) {
                if (count > 0) {
                    String[] values = line.split(" ");
                    Verb = values[5];
                    if (Verb.equals("\"POST")) {
                        POST = values[5];
                    }
                    if (Verb.equals("\"PUT")) {
                        PUT = values[5];
                    }
                    if (Verb.equals("\"DELETE")) {
                        DELETE = values[5];
                    }
                    if (Verb.equals("\"PATCH")) {
                        PATCH = values[5];
                    }
                    if (Verb.equals("\"GET")) {
                        GET = values[5];
                    }
                    if (Verb.equals("\"OPTIONS")) {
                        OPTIONS = values[5];
                    }
                }
                count++;
            }

            System.out.println("HTTP verb " + POST);
            System.out.println("HTTP verb " + PUT);
            System.out.println("HTTP verb " + DELETE);
            System.out.println("HTTP verb " + PATCH);
            System.out.println("HTTP verb " + GET);
            System.out.println("HTTP verb " + OPTIONS);
            System.out.println("That is all...");

        } catch (Exception e) {

        }
    }
}
