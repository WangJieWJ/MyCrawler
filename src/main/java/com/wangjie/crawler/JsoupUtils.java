package com.wangjie.crawler;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Title:
 * Description: 解析HTML字符串中的 链接地址
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/31
 */
public class JsoupUtils {

    //筛选规则
    private static final String regx = "";

    public static void getURLData(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println("title:"+doc.title());
            System.out.println("data:"+doc.data());
            System.out.println("toString:"+doc.toString());
            System.out.println("val:"+doc.val());
        }catch (IOException e){
            System.out.println("JSOUP获取远程URL数据出错");
        }
    }


    public static void main(String[] args){
        JsoupUtils.getURLData("https://www.taobao.com/");
    }
}
