package com.alipay.sofa.tracer.demo.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * RPCDemoApplication
 *
 * @author yangguanchao
 * @since 2018/08/22
 */
@SpringBootApplication
@ImportResource({ "classpath:rpc-server-example.xml" })
public class RPCDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RPCDemoApplication.class, args);
    }
}
