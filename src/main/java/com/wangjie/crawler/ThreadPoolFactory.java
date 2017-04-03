package com.wangjie.crawler;

import java.util.concurrent.*;

/**
 * Title:
 * Description:
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/28
 */
public class ThreadPoolFactory {

    //线程池
    private static ThreadPoolExecutor poolExecutor;

    /**
     * 私有化构造函数
     */
    private ThreadPoolFactory() {
    }

    /**
     * 获取线程池对象
     *
     * @return
     */
    public static ThreadPoolExecutor getInstance() {
        if (poolExecutor == null) {
            MyRejectedExecutionHandler handler = new MyRejectedExecutionHandler();
            LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
            poolExecutor = new ThreadPoolExecutor(10, 20, 40, TimeUnit.SECONDS, queue, handler);

        }
        return poolExecutor;
    }
}
