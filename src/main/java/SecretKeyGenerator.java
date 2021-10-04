import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class SecretKeyGenerator {

    public static String encode(String key, String data) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
    }

    public static void main(String [] args) throws Exception {
        System.out.println(encode("4997db4d50255522457e1b7323d9f23197f6ba4feb892c462a09bdba999fe554", "5d7c6e8179dad4dcaa067d94ea325761039e9df44c67a7367816f2eafeb0053f"));
    }
}
