package cn.itc7.sc.feign.consumedemo.service.impl;

import cn.itc7.sc.feign.consumedemo.service.ConsumerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ConsumerClient的回调类,熔断时调用
 *
 * Created by fanpengju on 2017/3/4.
 */
@Component //需加
public class ConsumerClientHystrix implements ConsumerClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return 666;
    }
}
