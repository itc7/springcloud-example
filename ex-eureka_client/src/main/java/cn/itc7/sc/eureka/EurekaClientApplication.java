package cn.itc7.sc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by fpj on 2017/04/17.
 */
@SpringBootApplication
@EnableEurekaClient //开启注册功能（通过配置文件寻找注册发现服务）
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
