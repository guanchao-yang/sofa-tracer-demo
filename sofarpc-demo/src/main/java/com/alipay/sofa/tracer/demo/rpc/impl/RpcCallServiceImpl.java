package com.alipay.sofa.tracer.demo.rpc.impl;

import com.alipay.sofa.tracer.demo.facade.RpcCallService;
import com.alipay.sofa.tracer.plugins.datasource.SmartDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.Statement;

/**
 * RpcCallServiceImpl
 *
 * @author yangguanchao
 * @since 2018/08/22
 */
public class RpcCallServiceImpl implements RpcCallService{

    @Autowired
    private SmartDataSource smartDataSource;

    @Override
    public String helloTracer(String param) throws Exception{
        Connection cn = smartDataSource.getConnection();
        Statement st = cn.createStatement();
        st.execute("DROP TABLE IF EXISTS TEST;\n"
                + "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));");

        return "Param is " + param + " and call success!";
    }
}
