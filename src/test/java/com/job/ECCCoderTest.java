package com.job;


import com.job.ecc.ECCCoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * http://snowolf.iteye.com/blog/383412
 * Java加密技术（七）——非对称加密算法最高级ECC
 */
public class ECCCoderTest {

    @Test
    public void test() throws Exception {
        String inputStr = "abc";
        byte[] data = inputStr.getBytes();

        Map<String, Object> keyMap = ECCCoder.initKey();

        String publicKey = ECCCoder.getPublicKey(keyMap);
        String privateKey = ECCCoder.getPrivateKey(keyMap);
        System.err.println("公钥: \n" + publicKey);
        System.err.println("私钥： \n" + privateKey);

        byte[] encodedData = ECCCoder.encrypt(data, publicKey);

        byte[] decodedData = ECCCoder.decrypt(encodedData, privateKey);

        String outputStr = new String(decodedData);
        System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);
        Assert.assertEquals(inputStr, outputStr);
    }

}
