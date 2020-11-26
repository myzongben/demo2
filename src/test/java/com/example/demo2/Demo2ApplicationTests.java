package com.example.demo2;

import com.example.wzb.Demo2Application;
import com.example.wzb.entity.TPayBill;
import com.example.wzb.service.IndexService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;


@SpringBootTest(classes = Demo2Application.class)
public class Demo2ApplicationTests {

    private String name;
   @Resource
   private IndexService indexService;
   @Resource
   private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    @Ignore
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
    @Test
    void contextLoads2() throws InterruptedException, ExecutionException, TimeoutException {
        System.out.println("县城名城："+Thread.currentThread().getName());
        Future<List<TPayBill>> submit = threadPoolTaskExecutor.submit(
                new Callable<List<TPayBill>>() {
                    @Override
                    public List<TPayBill> call() throws Exception {
                        List<TPayBill> tPayBills = indexService.queryList();
                         System.out.println("县城名城："+Thread.currentThread().getName());
                        return tPayBills;
                    }
                });
        System.out.println("县城名城："+Thread.currentThread().getName());
        List<TPayBill> tPayBills = submit.get(5, TimeUnit.SECONDS);
        System.out.println(tPayBills);
        //System.out.println(indexService.queryList());

    }
}
