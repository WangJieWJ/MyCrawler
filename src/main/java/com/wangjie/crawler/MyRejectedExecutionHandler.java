package com.wangjie.crawler;

import org.apache.log4j.Logger;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Title:
 * Description:
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/28
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {

    private static final Logger logger=Logger.getLogger(MyRejectedExecutionHandler.class);

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        logger.info("Begin exception handler");

    }
}
