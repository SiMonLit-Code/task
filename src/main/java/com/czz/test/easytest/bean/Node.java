package com.czz.test.easytest.bean;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Bovin
 * @description
 * @since 2020-07-23 13:33
 **/
public class Node {

    private Set<String> labels = new HashSet<>();

    private String name;

    private String meaningTag;

    private String abs;

    private String imageUrl;

    private Map<String, Object> metaData;

    public Set<String> getLabels() {
        return labels;
    }

    public void setLabels(Set<String> labels) {
        this.labels = labels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaningTag() {
        return meaningTag;
    }

    public void setMeaningTag(String meaningTag) {
        this.meaningTag = meaningTag;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Map<String, Object> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, Object> metaData) {
        this.metaData = metaData;
    }
}
