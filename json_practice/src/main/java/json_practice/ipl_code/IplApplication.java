package json_practice.ipl_code;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class IplApplication {
    public static void main(String[] args) throws Exception {
        IplJsonProcessor.processJson();
        IPLCsvProcessor.processCsv();
        System.out.println("IPL JSON & CSV Censored Successfully");
    }
}
