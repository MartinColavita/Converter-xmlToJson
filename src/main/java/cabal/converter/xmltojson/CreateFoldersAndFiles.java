package cabal.converter.xmltojson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CreateFoldersAndFiles {
    public static void main(String[] args) throws IOException {
        CreateAll("AccountSummariesList");
        CreateAll("AccountSelectionByAccount");
        CreateAll("AccountSelectionByCard");
        CreateAll("AccountSelectionByAccountNewCore");
        CreateAll("AccountSelectionByCardNewCore");
        CreateAll("AccountSelectionByDocument");
        CreateAll("AccountSelectionByDocumentNewCore");
        CreateAll("CallAccountSelection");
        CreateAll("AccountInfo");
        CreateAll("AvaliblesInfo");
        CreateAll("AccountMovements");
        CreateAll("AnnualConsumptionReportInfo");
        CreateAll("AutomaticDebitsInfo");
        CreateAll("GetAvisoViaje");
        CreateAll("SetAvisoViaje");
        CreateAll("SetAvisoViajeTs");
        CreateAll("DeleteAvisoViaje");
        CreateAll("GetQueryCuotificacion");
        CreateAll("ConfirmCuotificacion");
        CreateAll("ConfirmCuotificacionAdmin");
        CreateAll("GetQuestionsUser");
        CreateAll("NewUserRegistration");
        CreateAll("ChangePasswordUser");
        CreateAll("ChangeUserNameAndPassword");
        CreateAll("CheckUserSmsPassword");
        CreateAll("ResetPassword");
    }

    static void CreateAll(String parametro) throws IOException {
        String pathXmlRoot="Z:\\PRIVADO\\CABAL\\xjconversor\\xmltojson\\src\\main\\resources\\xml\\";
        String xmlFile = "";
        String file1= pathXmlRoot+"\\"+ parametro + "\\"+ parametro +"_soap1_1-request.xml";
        String file2= pathXmlRoot+"\\"+ parametro + "\\"+ parametro +"_soap1_1-response.xml";
        String file3= pathXmlRoot+"\\"+ parametro + "\\"+ parametro +"_soap1_2-request.xml";
        String file4= pathXmlRoot+"\\"+ parametro + "\\"+ parametro +"_soap1_2-response.xml";

        String file5= pathXmlRoot+"\\"+ parametro + "\\GET\\"+ parametro+"_GET.xml";
        String file6= pathXmlRoot+"\\"+ parametro + "\\POST\\"+ parametro+"_POST.xml";

        File out_file1 = new File (file1);
        File out_file2 = new File (file2);
        File out_file3 = new File (file3);
        File out_file4 = new File (file4);
        File out_file5 = new File (file5);
        File out_file6 = new File (file6);
        FileUtils.writeStringToFile(out_file1,"","UTF-8");
        FileUtils.writeStringToFile(out_file2,"","UTF-8");
        FileUtils.writeStringToFile(out_file3,"","UTF-8");
        FileUtils.writeStringToFile(out_file4,"","UTF-8");
        FileUtils.writeStringToFile(out_file5,"","UTF-8");
        FileUtils.writeStringToFile(out_file6,"","UTF-8");


//            // Escribir el resultado en un archivo
//            String archivo=xmlPathfile.replace(".xml",".json");
//            File outputFile = new File(pathTmp+archivo);
//            FileUtils.writeStringToFile(outputFile, value, "UTF-8");
    }

}
