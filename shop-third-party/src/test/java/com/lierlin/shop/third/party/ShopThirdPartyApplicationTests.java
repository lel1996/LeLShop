package com.lierlin.shop.third.party;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class ShopThirdPartyApplicationTests {
    @Autowired
    OSS ossClient;
    @Test
    void contextLoads() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\lierlin\\Desktop\\lierlin.jpg");
        ossClient.putObject("lierlin","lierlin",inputStream);
        ossClient.shutdown();
        System.out.println("success and application is over....");
    }

}
