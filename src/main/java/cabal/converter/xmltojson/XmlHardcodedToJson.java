package cabal.converter.xmltojson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlHardcodedToJson {

    static void ConvertXmlHardcodeToJson(){
        System.out.println("Hardcode XML to JSON");

        String data = "<?xml version='1.0' encoding='UTF-8'?>" +
                "<student>" +
                "<age>11</age>" +
                "<id>12</id>" +
                "<name>JavaInterviewPoint</name>" +
                "</student>";
        try {
            // Create a new XmlMapper to read XML tags
            XmlMapper xmlMapper = new XmlMapper();
            //Reading the XML
            JsonNode jsonNode = xmlMapper.readTree(data.getBytes());
            //Create a new ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            //Get JSON as a string
            String jsonResult = objectMapper.writeValueAsString(jsonNode);
            System.out.println("*** Converting XML to JSON ***");
            System.out.println(jsonResult);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
