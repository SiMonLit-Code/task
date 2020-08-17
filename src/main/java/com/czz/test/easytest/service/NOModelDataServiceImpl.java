package com.czz.test.easytest.service;

import com.czz.test.easytest.bean.Node;
import com.czz.test.easytest.converter.DocumentConverter;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.BasicBSONObject;
import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-17 13:38:00
 * @description :
 */
@Service
public class NOModelDataServiceImpl implements NOModeDataService {
    @Resource
    MongoClient mongoClient;


    @Override
    public void saveData(List<Map<String,Object>> data) {

        for (Map<String,Object> map: data) {
            Document document = new Document();
            document.append("id","");
            document.append("name","");
            document.append("lowercase_name","");
            document.append("type","");
            document.append("meta_data",map);
            document.append("meaning_tag","");
            document.append("abstract","");
            MongoCollection<Document> collection = mongoClient.getDatabase("bbbb").getCollection("aaaa");
            collection.insertOne(document);
        }
    }
}
