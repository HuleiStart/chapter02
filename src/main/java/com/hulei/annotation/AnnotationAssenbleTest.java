package com.hulei.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Hu
 * @create 2022/10/18 12:37
 */
public class AnnotationAssenbleTest {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
//        定义配置文件路径
        String xmlPath = "beans1.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        获取UserController实例
        UserController userController = (UserController) applicationContext.getBean("userController");
//        调用UserController中的save（）方法
        userController.save();
    }
}
