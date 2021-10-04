import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class XMLParsing {
static String errorMessage ="";
public static void main(String arg[]) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        String s ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n" +
                "    <env:Header>\n" +
                "        <wsa:Action>http://xmlns.oracle.com/apps/scm/shipping/shipConfirm/deliveries/shipmentLineService//ShipmentLineService/packResponse</wsa:Action>\n" +
                "        <wsa:MessageID>urn:uuid:7fb5f1e8-e5d0-4d95-8816-3b52e3b0a36b</wsa:MessageID>\n" +
                "        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" env:mustUnderstand=\"1\">\n" +
                "            <wsu:Timestamp xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\" wsu:Id=\"Timestamp-J01A6Pnb6yMtiXNZgQzv2g22\">\n" +
                "                <wsu:Created>2021-07-12T11:23:51Z</wsu:Created>\n" +
                "                <wsu:Expires>2021-07-15T22:43:51Z</wsu:Expires>\n" +
                "            </wsu:Timestamp>\n" +
                "        </wsse:Security>\n" +
                "    </env:Header>\n" +
                "    <env:Body>\n" +
                "        <ns0:packResponse xmlns:ns0=\"http://xmlns.oracle.com/apps/scm/shipping/shipConfirm/deliveries/shipmentLineService/types/\">\n" +
                "            <ns1:result xmlns:ns1=\"http://xmlns.oracle.com/apps/scm/shipping/shipConfirm/deliveries/shipmentLineService/types/\" xmlns:ns0=\"http://xmlns.oracle.com/apps/scm/shipping/shipConfirm/deliveries/shipmentLineService/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns0:PackResponse\">\n" +
                "                <ns0:ReturnStatus>ERROR</ns0:ReturnStatus>\n" +
                "                <ns0:MessageCount>4</ns0:MessageCount>\n" +
                "                <ns0:Message>\n" +
                "                    <ns0:ShipmentLine xsi:nil=\"true\"/>\n" +
                "                    <ns0:MessageText>The item INT_PL_ITEM_PACK on shipment line 40008 cannot be packed into the packing unit.</ns0:MessageText>\n" +
                "                </ns0:Message>\n" +
                "                <ns0:Message>\n" +
                "                    <ns0:ShipmentLine xsi:nil=\"true\"/>\n" +
                "                    <ns0:MessageText>These entities cannot be grouped because their grouping attributes do not match.</ns0:MessageText>\n" +
                "                </ns0:Message>\n" +
                "                <ns0:Message>\n" +
                "                    <ns0:ShipmentLine xsi:nil=\"true\"/>\n" +
                "                    <ns0:MessageText>You cannot pack or unpack the shipment lines.</ns0:MessageText>\n" +
                "                </ns0:Message>\n" +
                "                <ns0:Message>\n" +
                "                    <ns0:ShipmentLine xsi:nil=\"true\"/>\n" +
                "                    <ns0:MessageText>An error occurred while assigning or unassigning shipment details from a packing unit.</ns0:MessageText>\n" +
                "                </ns0:Message>\n" +
                "            </ns1:result>\n" +
                "        </ns0:packResponse>\n" +
                "    </env:Body>\n" +
                "</env:Envelope>";
    String[] y = s.split("<ns0:MessageText>");

    ArrayList arr = new ArrayList();
    for( int i=0; i<y.length; i++ ){
        String string = y[i];
        String substring = "</ns0:MessageText>";
        if(string.indexOf(substring) != -1){
            arr.add(y[i].split("</ns0:MessageText>")[0]);
        }

    }
    System.out.println(arr.toString());
    }
}
