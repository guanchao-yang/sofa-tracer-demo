package com.alipay.sofa.tracer.demo.springmvc.controller;

import com.alipay.sofa.tracer.demo.facade.RpcCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * SampleRestController
 *
 * @author yangguanchao
 * @since 2018/08/21
 */
@RestController
public class SampleRestController {

    @Autowired
    private RpcCallService rpcCallService;

    private static final String TEMPLATE = "Hello, %s!";

    private final AtomicLong    counter  = new AtomicLong();

    /***
     * http://localhost:8080/springmvc
     * @param name name
     * @return map
     */
    @RequestMapping("/springmvc")
    public Map<String, Object> springmvc(@RequestParam(value = "name", defaultValue = "SOFATracer") String name) throws Exception {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("success", true);
        resultMap.put("id", counter.incrementAndGet());
        resultMap.put("content", String.format(TEMPLATE, name));
        resultMap.put("rpc", rpcCallService.helloTracer(name));
        return resultMap;
    }
}
