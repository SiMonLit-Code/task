package com.czz.test.easytest;

import com.alibaba.excel.EasyExcel;
import com.czz.test.easytest.controller.NoModelDataListener;
import com.czz.test.easytest.service.NOModeDataService;
import com.czz.test.easytest.service.NOModelDataServiceImpl;
import com.mongodb.BasicDBObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

@SpringBootTest
class EasytestApplicationTests {
    @Resource
    NOModeDataService service;

    @Test
    void contextLoads() {
    }
    /**
     * 不创建对象的读
     */
    @Test
    public void noModelRead() {
//        HashMap<Integer,String> map=new HashMap<>();
//        map.put(1,"c");
//        map.put(2,"z");
//        String s = "123";
//        mongoTemplate.insertAll(map.values());

        String fileName = "D:\\Chrome\\entity.xlsx";
        // 这里 只要，然后读取第一个sheet 同步读取会自动finish
        EasyExcel.read(fileName, new NoModelDataListener(service)).sheet().doRead();
    }


}
