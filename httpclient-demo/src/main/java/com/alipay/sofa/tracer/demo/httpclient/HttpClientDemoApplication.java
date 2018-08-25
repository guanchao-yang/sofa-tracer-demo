package com.alipay.sofa.tracer.demo.httpclient;

import com.alipay.sofa.tracer.demo.httpclient.client.HttpClientInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * HttpClientDemoApplication
 *
 * @author yangguanchao
 * @since 2018/08/21
 */
@SpringBootApplication
public class HttpClientDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(HttpClientDemoApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HttpClientDemoApplication.class, args);
        HttpClientInstance httpClientInstance = new HttpClientInstance(10 * 1000);
        String httpGetUrl = "http://localhost:8080/springmvc";
        String responseStr = httpClientInstance.executeGet(httpGetUrl);
        logger.info("Response is {}", responseStr);
        Thread.sleep(10 * 1000);
    }
}
