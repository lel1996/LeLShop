package com.lierlin.shop.product;

/*import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.CannedAccessControlList;*/
import com.lierlin.shop.product.entity.BrandEntity;
import com.lierlin.shop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class ShopProductApplicationTests {

    @Autowired
    BrandService brandService;

   /* @Test
    void testLoad() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
        String accessKeyId = "";
        String accessKeySecret = "";
        String bucketName = "lierlin";
        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        //String objectName = "C:\\Users\\lierlin\\Desktop\\lierlin.jpg";
        InputStream inputStream = new FileInputStream("C:\\Users\\lierlin\\Desktop\\lierlin.jpg");

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        String content = "lierlin";
        ossClient.putObject(bucketName, content, inputStream);
        //ossClient.setObjectAcl(bucketName,objectName, CannedAccessControlList.PublicRead);
        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }
*/
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("lierlin");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
