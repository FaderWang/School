package com.faderw.school.config;

import com.faderw.school.spring.MapperAutoConfiguredMyBatisRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by FaderW on 2018/8/1
 */
@Configuration
@Import(MapperAutoConfiguredMyBatisRegistrar.class)
public class MapperAutoConfig {
}
