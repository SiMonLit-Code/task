package com.czz.test.easytest.bean;

import java.util.Map;

/**
 * @author Bovin
 * @description
 * @since 2020-07-23 13:50
 **/
public class Property {
    private String key;

    private Object value;

    private Map<String, Object> metaData;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Map<String, Object> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, Object> metaData) {
        this.metaData = metaData;
    }
}
