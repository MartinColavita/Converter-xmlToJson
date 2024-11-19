package cabal.converter.jsontoxml;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class JsonFileToXml {

    static void ConvertJsonFileToXml() throws IOException {
        String jsonFilePath = "RUTA/DEL/ARCHIVO";
        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode node = jsonMapper.readValue(new File(jsonFilePath), JsonNode.class);
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
        StringWriter sw = new StringWriter();
        xmlMapper.writeValue(sw, node);
        System.out.println(sw.toString());
    }

}
