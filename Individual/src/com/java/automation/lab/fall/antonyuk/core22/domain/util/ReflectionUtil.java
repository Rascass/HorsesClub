package com.java.automation.lab.fall.antonyuk.core22.domain.util;

import java.lang.reflect.ParameterizedType;

public class ReflectionUtil {
    public static Class getGenericParameterClass(Class actualClass, int parameterIndex) {
        return (Class) ((ParameterizedType) actualClass
                .getGenericSuperclass())
                .getActualTypeArguments()[parameterIndex];
    }
}
