package com.lin.missyou.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: CardCondition
 * @author: leozhu
 * @create: 2020-09-17 10:05
 **/
public class CardCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String propertyName = conditionContext.getEnvironment().getProperty("hero.condition");
        return "card".equalsIgnoreCase(propertyName);

    }
}
