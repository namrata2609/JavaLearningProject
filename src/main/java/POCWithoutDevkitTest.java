import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.signature.AuthorizationHeaderSigningStrategy;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;


import javax.swing.text.html.FormSubmitEvent;

public class POCWithoutDevkitTest {

    //private DataService service;
    private OAuthConsumer oAuthConsumer;
    private static String realmID = null;



    public POCWithoutDevkitTest() {
        realmID = "7315858";
        String consumerKey = "5b7707fc0e27d11190c35259b872dff8f9f5bfa92508ccaad876c908078c79e4";
        String consumerSecret = "3bc5b8f047fd328c703aad7e045fbed31fdf59d1219f64869607c5d230960d49";
        String accessToken = "4997db4d50255522457e1b7323d9f23197f6ba4feb892c462a09bdba999fe554";
        String accessTokenSecret = "5d7c6e8179dad4dcaa067d94ea325761039e9df44c67a7367816f2eafeb0053f";

        setupContext(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }

    public void setupContext(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) {
        this.oAuthConsumer = new CommonsHttpOAuthConsumer(consumerKey, consumerSecret);
        oAuthConsumer.setTokenWithSecret(accessToken, accessTokenSecret);
        oAuthConsumer.setSigningStrategy(new AuthorizationHeaderSigningStrategy());
    }

    public void authorize(HttpRequestBase httpRequest) throws Exception, Exception {
        try {
            oAuthConsumer.sign(httpRequest);
        } catch (OAuthMessageSignerException e) {
            throw new Exception(e);
        } catch (OAuthExpectationFailedException e) {
            throw new Exception(e);
        } catch (OAuthCommunicationException e) {
            throw new Exception(e);
        }
    }

    public void executeGetRequest(String customURIString){
        DefaultHttpClient client = new DefaultHttpClient();
        client.getParams().setParameter("http.protocol.content-charset", "UTF-8");

        HttpRequestBase httpRequest = null;
        URI uri = null;

        try {
            uri = new URI(customURIString);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        String methodtype = "GET";

        if (methodtype.equals(FormSubmitEvent.MethodType.GET.toString())) {
            httpRequest = new HttpGet(uri);
        }

        httpRequest.addHeader("content-type", "application/vnd.api+json");
        httpRequest.addHeader("Accept","*");

        try {
            authorize(httpRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }


        HttpResponse httpResponse = null;
        try {
            HttpHost target = new HttpHost(uri.getHost(), -1, uri.getScheme());
            httpResponse = client.execute(target, httpRequest);
            System.out.println("Connection status : " + httpResponse.getStatusLine());

            InputStream inputStraem = httpResponse.getEntity().getContent();

            StringWriter writer = new StringWriter();
            IOUtils.copy(inputStraem, writer, "UTF-8");
            String output = writer.toString();

            System.out.println(output);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        POCWithoutDevkitTest withoutDevkitClient = new POCWithoutDevkitTest();
        withoutDevkitClient.executeGetRequest("https://7315858.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=10&deploy=1");
    }
}
