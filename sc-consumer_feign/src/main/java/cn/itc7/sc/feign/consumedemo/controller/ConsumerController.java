package cn.itc7.sc.feign.consumedemo.controller;

import cn.itc7.sc.feign.consumedemo.service.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanpengju on 2017/3/3.
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerClient consumerClient;

    @RequestMapping(value = "/sum")
    public Integer add() {
        return consumerClient.add(10, 20);
    }

}
