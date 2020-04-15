package com.example.gmall.manage;

;
import com.example.gmall.util.GmallRedissonConfig;
import com.example.gmall.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    GmallRedissonConfig gmallRedissonConfig;
    @Test
    public void test(){
        System.out.println(gmallRedissonConfig);

        System.out.println("asdfadsf");
    }


}
