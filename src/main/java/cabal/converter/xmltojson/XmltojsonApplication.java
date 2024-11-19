package cabal.converter.xmltojson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class XmltojsonApplication {

    public static void main(String[] args) {

        SpringApplication.run(XmltojsonApplication.class, args);
//        XmlHardcodeToJson.ConvertXmlHardcodeToJson();

//        titulo("LoginUser");
//
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\LoginUser_soap1_1-request.xml");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\LoginUser_soap1_1-response.xml");
//        System.out.println("*****");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\LoginUser_soap1_2-request.xml");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\LoginUser_soap1_2-response.xml");
//        System.out.println("*****");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\GET\\LoginUser_GET.xml");
//        System.out.println("*****");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUser\\POST\\LoginUser_POST.xml");
//
//        titulo("LoginUserInternal");
//
//        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\LoginUserInternal_soap1_1-request.xml");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\LoginUserInternal_soap1_1-response.xml");
//        System.out.println("*****");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\LoginUserInternal_soap1_2-request.xml");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\LoginUserInternal_soap1_2-response.xml");
//        System.out.println("*****");
//        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\GET\\LoginUserInternal_GET.xml");
//        System.out.println("*****");
        XmlFileToJson.ConvertXmlFileToJson("LoginUserInternal\\POST\\LoginUserInternal_POST.xml");
    }

    public static void titulo(String titulo){
        System.out.println("*****");
        System.out.println(String.format( "*** %s ***",titulo));
        System.out.println("*****");
    }


}


