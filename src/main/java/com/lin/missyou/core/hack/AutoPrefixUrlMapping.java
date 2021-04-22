package com.lin.missyou.core.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * @description: 处理路由前缀配置
 * @author: leozhu
 * @create: 2020-09-29 13:16
 **/
public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {

    @Value("${missyou.api-package}")
    private String apiPackagePath;

    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo requestMappingInfo = super.getMappingForMethod(method, handlerType);
        if(requestMappingInfo != null){
            String prefix = this.getPrefix(handlerType);
            RequestMappingInfo mappingInfo = RequestMappingInfo.paths(prefix).build().combine(requestMappingInfo);
            return mappingInfo;
        }
        return requestMappingInfo;
    }

    private String getPrefix(Class<?> handlerType){
        String packageName = handlerType.getPackage().getName();
        String dotPath = packageName.replaceAll(this.apiPackagePath, "");
        return dotPath.replace(".","/");
    }
}
