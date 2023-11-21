package com.cz.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouchaoyu
 * @time 2023-11-05-16:05
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    //sentinel 热点key
    @GetMapping("/testHotKey" )
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotkey",blockHandlerClass = {})
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "------testHotKey";
    }
    public String deal_testHotkey(String p1, String p2, BlockException e){
        return "------deal_testHotkey";
    }
}

