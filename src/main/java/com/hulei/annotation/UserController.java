package com.hulei.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Mr.Hu
 * @create 2022/10/18 11:07
 */

//使用@Controller注解将UserController类标识为Spring中的Bean--------相当于配置文件中<bean id="userController" class="com.hulei.annotation.UserController"/>
@Controller("userController")
public class UserController {
//    使用@Resource注解注入  -------- 相当于<property name="userService" ref="userService"/>
    @Resource(name="userService")
    private UserService userService;
    public void save(){
        this.userService.save();
        System.out.println("运行userController.save()");
    }
}
