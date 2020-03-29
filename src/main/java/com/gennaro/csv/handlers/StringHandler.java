package com.gennaro.csv.handlers;

import java.lang.reflect.Field;

public class StringHandler extends Handler{

    @Override
    public void handle(String value, Object object, Field field) throws IllegalAccessException {
        this.setSafely(value.length() < 1 ? null : value, object, field);
    }
}
