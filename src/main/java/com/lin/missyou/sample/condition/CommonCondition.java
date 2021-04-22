package com.lin.missyou.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: 公共Condition
 * @author: leozhu
 * @create: 2020-09-17 10:28
 **/
public class CommonCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        boolean flag = false;
        String conditionName = conditionContext.getEnvironment().getProperty("hero.condition");
        switch (conditionName){
            case "diana":
                flag = Boolean.TRUE;
                break;
            case "card":
                return true;
            case "yase":
                return true;
            default:
                break;
        }
        return flag;
    }
}
