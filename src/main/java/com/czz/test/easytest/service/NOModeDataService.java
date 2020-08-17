package com.czz.test.easytest.service;

import org.bson.BasicBSONObject;

import java.util.List;
import java.util.Map;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-17 13:51:00
 * @description :
 */
public interface NOModeDataService {
    void saveData(List<Map<String,Object>> list);
}
