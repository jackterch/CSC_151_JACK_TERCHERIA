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
            String message;
            String line="";
            int count = 0;

            if(csv_file.exists() && log_file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

                if(count > 0){
                    String[] value = line.split(",");
                }
                
                while((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            

            csv_file_writer.close();

            }
        }
        catch(IOException e) {

        }
    }
}
