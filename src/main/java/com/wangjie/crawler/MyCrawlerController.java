package com.wangjie.crawler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * Title:
 * Description:
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/27
 */
@RestController
public class MyCrawlerController {

    public static void main(String[] args) {

//        ThreadPoolExecutor threadPoolExecutor=ThreadPoolFactory.getInstance();
//        for (int i = 0; i < 10000; i++) {
//            MyThread thread = new MyThread("正在执行定时任务：" + i);
//            threadPoolExecutor.execute(thread);
//        }

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("type",123);
        map.put("type",map.get("type"));
        for(Map.Entry<String,Object> entry: map.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

    }

}
