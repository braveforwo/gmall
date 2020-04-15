package com.example.gmall.manage;




import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class GmallManageWebApplicationTests {

    @Test
    void contextLoads() throws IOException, MyException {
       String f= GmallManageWebApplicationTests.class.getResource("/tracker.conf").getPath();//获取配置文件路径
       System.out.println(f);
    }

}
