package com.example.wzb.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  @author: wangzongben
 *  @Date: 2020/11/26 16:25
 *  @Description:  线程池自定义属性配置实体类，将配置文件中的
 *  自定义属性隐射到该实体类中
 *
 *  注意先要引入pom文件依赖spring-boot-configuration-processor
 */
@Component
@ConfigurationProperties(prefix = "wzb.threadpool")
public class ThreadPoolProperties {
    private int corePoolSize;
    private int maxPoolSize;
    private boolean waitForTasksToCompleteOnShutdown;

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public boolean getWaitForTasksToCompleteOnShutdown() {
        return waitForTasksToCompleteOnShutdown;
    }

    public void setWaitForTasksToCompleteOnShutdown(boolean waitForTasksToCompleteOnShutdown) {
        this.waitForTasksToCompleteOnShutdown = waitForTasksToCompleteOnShutdown;
    }
}
