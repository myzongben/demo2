package com.example.wzb.pool;

import com.example.wzb.properties.ThreadPoolProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 *  @author: wangzongben
 *  @Date: 2020/11/26 15:34
 *  @Description:配置线程池
 */
@Configuration
public class ThreadPoolConfig {
    @Bean
    public ThreadPoolTaskExecutor  getThreadPoolTaskExecutor(ThreadPoolProperties poolProperties){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setAllowCoreThreadTimeOut(true);
        threadPoolTaskExecutor.setCorePoolSize(poolProperties.getCorePoolSize());
        threadPoolTaskExecutor.setMaxPoolSize(poolProperties.getMaxPoolSize());
        threadPoolTaskExecutor.setWaitForTasksToCompleteOnShutdown(poolProperties.getWaitForTasksToCompleteOnShutdown());
        return threadPoolTaskExecutor;
    }
}
