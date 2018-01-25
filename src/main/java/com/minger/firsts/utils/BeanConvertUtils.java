package com.minger.firsts.utils;

import org.springframework.util.Assert;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create By Liuym on 2018/1/25 0025
 */

public class BeanConvertUtils {

    private BeanConvertUtils() {
    }

    public static Map<String, Object> toMap(Object obj) {
        Assert.notNull(obj);
        Map<String, Object> result = new HashMap<String, Object>();
        List<Field> fields = getFields(obj.getClass());
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                if (null != field.get(obj)) {
                    result.put(field.getName(), field.get(obj));
                }
            } catch (Exception e) {//NOSONAR
            }
        }
        return result;
    }

    @SuppressWarnings("rawtypes")
    private static List<Field> getFields(Class clazz) {
        List<Field> result = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            result.add(field);
        }
        if (clazz.getSuperclass() != null) {
            result.addAll(getFields(clazz.getSuperclass()));
        }
        return result;
    }
}
