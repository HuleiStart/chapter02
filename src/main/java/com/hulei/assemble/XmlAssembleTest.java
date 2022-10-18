package com.hulei.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Mr.Hu
 * @create 2022/10/18 10:15
 */

public class XmlAssembleTest {
    public static void main(String[] args) {
//        1.初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2. 输出获得的实例
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
