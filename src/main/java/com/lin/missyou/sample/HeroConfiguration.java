package com.lin.missyou.sample;

import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Yase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: hero配置类
 * @author: leozhu
 * @create: 2020-09-16 16:32
 **/
@Configuration
public class HeroConfiguration {

//    @Bean
    public ISkill getDiana(){
        return new Diana("Diana",18);
    }

    @Bean
    public ISkill getYase(){
        return new Yase("Yase",25);
    }










//    @Conditional(DianaCondition.class)
//    @ConditionalOnProperty(value = "hero.condition",havingValue = "diana")
//    @Bean
//    @ConditionalOnBean(name = "mysql")
//    public ISkill getNewDiana(){
//        return new Diana("Diana","18");
//    }

//    @Bean
////    @Conditional(CardCondition.class)
//    @ConditionalOnProperty(value = "hero.condition",havingValue = "card",matchIfMissing = true)
//    public ISkill getNewCard(){
//        return new Card("Card","20");
//    }

//    @Bean
//    @Conditional(CommonCondition.class)
//    public ISkill getNewYase(){
//        return new Yase("Yase","25");
//    }
}
