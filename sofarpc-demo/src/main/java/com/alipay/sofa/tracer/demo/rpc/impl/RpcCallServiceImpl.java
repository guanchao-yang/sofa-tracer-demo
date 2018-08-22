package com.alipay.sofa.tracer.demo.rpc.impl;

import com.alipay.sofa.tracer.demo.facade.RpcCallService;

/**
 * RpcCallServiceImpl
 *
 * @author yangguanchao
 * @since 2018/08/22
 */
public class RpcCallServiceImpl implements RpcCallService{

    @Override
    public String helloTracer(String param) {
        return "Param is " + param + " and call success!";
    }
}
