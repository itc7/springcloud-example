package cn.itc7.sc.compute.sumdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fpj on 2017/04/17.
 */
@RestController
public class SumController {

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    int sumTest(Integer a, Integer b){
        return a + b;
    }
}
