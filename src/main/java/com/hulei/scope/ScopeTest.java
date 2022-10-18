package com.hulei.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Hu
 * @create 2022/10/18 9:47
 */
public class ScopeTest {
    public static void main(String[] args) {
//        1.初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.输出获得的实例
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));
    }
}
