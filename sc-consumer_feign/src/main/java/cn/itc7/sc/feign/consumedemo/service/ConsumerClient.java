package cn.itc7.sc.feign.consumedemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 只需要使用Feign来创建一个接口并用注解来配置它，既可完成一个Web Serivce客户端，有负载均衡能力
 *
 * Created by fanpengju on 2017/3/3.
 */
@FeignClient(value = "producer-compute"/*, fallback = ConsumerClientHystrix.class*/) //绑定该接口value=xxx服务 & 使用Hystrix的熔断机制
public interface ConsumerClient {

    @RequestMapping(value = "/sum",method = RequestMethod.GET) //匹配生产者的方法
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
