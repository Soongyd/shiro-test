package com.syd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTests {

    @Test
    public void contextLoads() {
        System.out.println("dev第一次操作");
        System.out.println("同事第一次操作");
    }

}
