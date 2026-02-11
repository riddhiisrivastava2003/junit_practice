package json_practice.basics;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class StudentJsonCreation {
    public static void main(String[] args) throws Exception {

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Riddhi");
        student.put("age", 22);
        student.put("subjects", Arrays.asList("Java", "Cybersecurity", "Salesforce"));

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValueAsString(student)
        );
    }
}