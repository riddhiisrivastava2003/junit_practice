package json_practice.basics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {
    public static void main(String[] args) throws Exception {

        String json = "{ \"name\": \"Riddhi\", \"age\": 24 }";
        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = mapper.readTree(json);

        if (!node.has("name") || !node.has("age")) {
            throw new RuntimeException("Invalid JSON");
        }

        if (!node.get("name").isTextual() || !node.get("age").isInt()) {
            throw new RuntimeException("Wrong data types");
        }

        System.out.println("JSON is valid ");
    }
}
