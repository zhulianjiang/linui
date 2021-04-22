package com.lin.missyou;

import com.lin.missyou.sample.*;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @description: 配置启动类
 * @author: leozhu
 * @create: 2020-09-21 23:07
 **/
//@ComponentScan
//@Import(LOLConfigurationSelector.class)
@EnableLOLConfiguration
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(LOLApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);
        ISkill iSkill = (ISkill) context.getBean("getYase");
        IConnect iConnect = (IConnect) context.getBean("mysql");
        iSkill.r();
        iConnect.connect();
    }
}
