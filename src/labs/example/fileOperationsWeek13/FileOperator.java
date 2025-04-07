// import necessary java packages
import java.io.*;

public class FileOperator {

    private static final String FILE_PATH = "C:\\Users\\Jack\\CSC_151_JACK_TERCHERIA\\src\\labs\\example\\fileOperations";
    private static final String FILE_NAME = "C:\\Users\\Jack\\CSC_151_JACK_TERCHERIA\\src\\labs\\example\\fileOperations\\files\\users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "\\logs\\api_error.log";

    public static void main() {
        // call the open file methods
        openCSVFile();
    }

    private static void openCSVFile() {
        File csv_file =  new File(FILE_NAME);
        File log_file = new File(ERROR_LOG_FILE);

        try {

            BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE,true));
            String message="";
            String line="";
            int count = 0;
            int grade = 0;
            int avg = 0;
            

            if(csv_file.exists() && log_file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));



                while((line = br.readLine()) != null) {
                    if (count > 0) {
                        String[] values = line.split(",");
                        int totalNumOfGrades = values.length - 1;
                        grade = Integer.parseInt(values[1]) + Integer.parseInt(values[2]) + Integer.parseInt(values[3]);
                        avg = grade / totalNumOfGrades;
                        System.out.println(values[0] + " average is: " + avg);
                    }
                    count++;
                }
            

            csv_file_writer.close();

            }
        }
        catch(IOException e) {
            System.err.println("There was error processing the file");
        }
    }
}
