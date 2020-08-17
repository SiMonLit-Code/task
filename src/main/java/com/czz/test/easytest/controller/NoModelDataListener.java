package com.czz.test.easytest.controller;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.czz.test.easytest.service.NOModeDataService;
import com.czz.test.easytest.service.NOModelDataServiceImpl;
import org.bson.BasicBSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-17 13:25:00
 * @description : 没实体读取excel文件
 */

public class NoModelDataListener extends AnalysisEventListener<Map<Integer,String>> {

    private static final Logger LOGGER= LoggerFactory.getLogger(NoModelDataListener.class);

    private final NOModeDataService noModelDataService ;


    public NoModelDataListener(NOModeDataService dataService){
        this.noModelDataService =dataService;
    }

    /**
     *
     */
    private static final int BATCH_COUNT=5;
    List<Map<String,Object>> list =new ArrayList<>();

    private Map<Integer,String> headMap;


    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        this.headMap = headMap;

    }

    @Override
    public void invoke(Map<Integer,String> data, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据：{}"+data.toString());

        Map<String,Object> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            Integer key = entry.getKey();
            String s = headMap.get(key);
            System.out.println(s);
            map.put(s,entry.getValue());
        }
        list.add(map);
        if (list.size()>=BATCH_COUNT){
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();

        LOGGER.info("所有数据解析完成！");
    }


    private void saveData(){
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        noModelDataService.saveData(list);
        LOGGER.info("存储数据库成功！");
    }


}
