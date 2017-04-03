package com.wangjie.crawler;

import org.apache.log4j.Logger;

/**
 * Title:
 * Description:
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/28
 */
public class MyThread extends Thread{

    private Logger logger=Logger.getLogger(MyThread.class);

    public String URL;

    public MyThread(String URL){
        this.URL=URL;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("执行处理逻辑 "+URL);
        //主要流程：
        //1、校验传递过来的URL是否可以使用。 比如是否是静态静态，如果是静态资源
        //2、通过HTTPClient来获取，网页的数据通过JSOUP来解析数据，获取页面中的链接
        //3、通过链接地址创建MyTread并存入到threadpool中。

    }
}
