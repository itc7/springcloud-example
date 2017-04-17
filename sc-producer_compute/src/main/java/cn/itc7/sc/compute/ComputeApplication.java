package cn.itc7.sc.compute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by fpj on 2017/04/17.
 */
@SpringBootApplication
@EnableEurekaClient
public class ComputeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputeApplication.class,args);
    }
}
