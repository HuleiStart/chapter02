package com.hulei.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @author Mr.Hu
 * @create 2022/10/18 10:31
 */
//使用@Service注解将UserServiceImpl类标识为Spring中的Bean---------相当于配置文件中<bean id="userService" class="com.hulei.annotation.UserServiceImpl"/>
@Service("userService")
 public class UserServiceImpl implements UserService{
//    使用@Resource注解注入 ----------相当于配置文件中<property name="UserDao" ref="userDao"/>
    @Resource(name="userDap")
    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("执行userService.save()");
    }
}
