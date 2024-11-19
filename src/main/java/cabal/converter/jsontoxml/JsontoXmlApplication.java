package cabal.converter.jsontoxml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class JsontoXmlApplication {
    public static void main(String[] args) throws IOException {
        JsonFileToXml.ConvertJsonFileToXml();
    }
}
