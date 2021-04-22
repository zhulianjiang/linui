package com.lin.missyou.sample.database;

import com.lin.missyou.sample.IConnect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: MySql
 * @author: leozhu
 * @create: 2020-09-17 10:58
 **/
//@Component
public class MySql implements IConnect {

    private String ip;
    private Integer port;

    public MySql(){ }

    public MySql(String ip,Integer port) {
        this.ip = ip;
        this.port = port;
        System.out.println(this.ip+";"+this.port);
    }

    @Override
    public void connect() {
        System.out.println("Mysql connect");
    }
}
