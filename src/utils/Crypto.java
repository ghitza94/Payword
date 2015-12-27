package utils;

import java.io.UnsupportedEncodingException;
import java.security.*;

/**
 * Created by virgil on 26.12.2015.
 */
public class Crypto {

    public static KeyPair getRSAKeyPair() {
        KeyPairGenerator keyPairGenerator = null;
        KeyPair keyPair = null;

        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(Constants.KEY_NO_OF_BITS);

            keyPair = keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return keyPair;
    }

    public static byte[] hashMessage(byte[] message) {
        byte[] hash = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            hash = messageDigest.digest(message);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hash;
    }

}
