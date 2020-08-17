package com.czz.test.easytest.converter;

import org.bson.BasicBSONObject;
import org.bson.Document;

import java.util.Map;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-17 14:27:00
 * @description :
 */
public class DocumentConverter<K,T> {

     public static<K,T> Document mapToDocument(Map<K, T> map){
         return new Document(new BasicBSONObject(map));
    }
}
