package com.wangjie.crawler;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Title:
 * Description:
 * <p>
 * Project: MyCrawler
 * Create User: 王杰
 * Create Time: 2017/3/27
 */
@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootApp.class,args);
        SpringApplication app = new SpringApplication(SpringBootApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
