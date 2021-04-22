package com.lin.missyou.sample;

import com.lin.missyou.sample.database.MySql;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 数据连接Configuration
 * @author: leozhu
 * @create: 2020-09-17 11:09
 **/
@Configuration
public class DataBaseConfiguration {

    @Value("${connect.mysql.ip}")
    private String ip;

    @Value("${connect.mysql.port}")
    private Integer port;

    @Bean
    public IConnect mysql(){
        return new MySql(this.ip,this.port);
    }
}
