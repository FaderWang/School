package com.faderw.school.spring;

import com.faderw.school.annotation.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * Created by FaderW on 2018/8/1
 * 继承ClassPathBeanDefinitionScanner，用来扫描加了自定义的注解的类
 * ClassPathBeanDefinitionScanner又继承ClassPathScanningCandidateComponentProvider类，
 * ClassPathScanningCandidateComponentProvider中有两个TypeFilter集合，includeFilters,excludeFilters。
 * 满足任意includeFilters不会被加载，同样的满足任意excludeFilters不会被加载
 */
@Slf4j
public class MyClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner{

    public MyClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
        super(registry, useDefaultFilters);
    }

    protected void registerFilters() {
        addIncludeFilter(new AnnotationTypeFilter(Mapper.class));
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        return super.doScan(basePackages);
    }

//    @Override
//    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
//        return beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().isIndependent();
//    }

    @Override
    protected boolean checkCandidate(String beanName, BeanDefinition beanDefinition) {
        if (super.checkCandidate(beanName, beanDefinition)) {
            return true;
        } else {
            logger.warn("Skipping MapperFactoryBean with name '" + beanName
                    + "' and '" + beanDefinition.getBeanClassName() + "' mapperInterface"
                    + ". Bean already defined with the same name!");
            return false;
        }
    }
}
