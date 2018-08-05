package com.faderw.school.annotation;
import java.lang.annotation.*;

/**
 * Created by FaderW on 2018/8/1
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface Mapper {
}
