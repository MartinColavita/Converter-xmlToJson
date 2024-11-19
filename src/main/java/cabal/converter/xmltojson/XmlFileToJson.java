package cabal.converter.xmltojson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class XmlFileToJson {
    static void ConvertXmlFileToJson(String xmlPathfile){
        String pathTmp="Z:\\PRIVADO\\CABAL\\xjconversor\\xmltojson\\src\\main\\resources\\xml\\tmpConverted\\";
        String pathXmlRoot="Z:\\PRIVADO\\CABAL\\xjconversor\\xmltojson\\src\\main\\resources\\xml\\";
        String xmlFile = "";
        try
        {
            xmlFile = FileUtils.readFileToString(new File(pathXmlRoot+xmlPathfile), "UTF-8");
            XmlMapper xmlMapper = new XmlMapper();// Create a new XmlMapper to read XML tags
            JsonNode jsonNode = xmlMapper.readTree(xmlFile.getBytes());//Reading the XML
            ObjectMapper objectMapper = new ObjectMapper();
            String value = objectMapper.writeValueAsString(jsonNode);
            System.out.println("*** Converting XML to JSON ***");
            System.out.println(value);

            // Escribir el resultado en un archivo
            String archivo=xmlPathfile.replace(".xml",".json");
            File outputFile = new File(pathTmp+archivo);
            FileUtils.writeStringToFile(outputFile, value, "UTF-8");
        } catch (JsonParseException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
