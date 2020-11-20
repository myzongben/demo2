package com.example.demo2;

import com.example.wzb.service.IndexService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class Demo2ApplicationTests {

    private String name;
   @Autowired
   private IndexService indexService;

    @Test
    void contextLoads() {
        //sout
        System.out.println("asdasdas");
        //"".field
        name = "laowang";
        //22.var
        int i = 22;
        String name = "laowang";
        Optional<String> name1 = Optional.of(name);


        System.out.println(indexService.queryList());

    }

}
