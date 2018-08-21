package com.alipay.sofa.tracer.demo.httpclient;

import com.alipay.sofa.tracer.demo.httpclient.client.HttpClientInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HttpClientDemoApplication
 *
 * @author yangguanchao
 * @since 2018/08/21
 */
public class HttpClientDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(HttpClientDemoApplication.class);

    public static void main(String[] args) throws Exception {
        HttpClientInstance httpClientInstance = new HttpClientInstance(10 * 1000);
        String httpGetUrl = "http://localhost:8080/springmvc";
        String responseStr = httpClientInstance.executeGet(httpGetUrl);
        logger.info("Response is {}", responseStr);
    }
}
