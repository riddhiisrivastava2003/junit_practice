package json_practice.handson_practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;

import java.io.InputStream;
import java.util.Set;

public class ValidatingEmailSchema {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json = mapper.readTree("{\"email\":\"riddhi@gmail.com\"}");

        InputStream schemaStream =
                ValidatingEmailSchema.class
                        .getClassLoader()
                        .getResourceAsStream("email_schema.json");

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaStream);

        Set<ValidationMessage> errors = schema.validate(json);

        System.out.println(errors.isEmpty() ? "Valid Email " : errors);
    }
}
