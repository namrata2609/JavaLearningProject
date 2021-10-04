import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

public class sendSMS {
    public static String send(String msg) {
        try {
            // Construct data
            String apiKey = "userName=" + "MOH_Mawrid";
            String message = "&password=" + "m3fuqy188";
           String sender = "&mobileNumber=" + "919984878033";
            String numbers = "&content=" +msg;
            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("http://sms.moh.gov.sa/smsservice/service1.asmx/SendSingleSMS?").openConnection();
            String data = apiKey + numbers + message + sender;
          // String data = apiKey + numbers + message; //+ test;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();
            System.out.print("Value"+stringBuffer.toString());
            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS "+e);
            return "Error "+e;
        }
    }

    public static void main(String[] args)throws IOException {

        send("OTM is 1234");
    }
}