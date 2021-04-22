package com.lin.missyou.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: DianaCondition
 * @author: leozhu
 * @create: 2020-09-17 09:58
 **/
public class DianaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String propertyName = conditionContext.getEnvironment().getProperty("hero.condition");
        return "diana".equalsIgnoreCase(propertyName);
    }
}
