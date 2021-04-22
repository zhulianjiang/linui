package com.lin.missyou.sample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: 配置类Selector
 * @author: leozhu
 * @create: 2020-09-21 23:24
 **/
public class LOLConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HeroConfiguration.class.getName(),DataBaseConfiguration.class.getName()};
    }
}
