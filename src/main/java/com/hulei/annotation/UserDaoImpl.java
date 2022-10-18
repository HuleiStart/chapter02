package com.hulei.annotation;

import org.springframework.stereotype.Repository;
/**
 * @author Mr.Hu
 * @create 2022/10/18 10:23
 *
 */

//使用注解@Repository将UserDaoImpl类标识为Spring中的Bean--------相当于配置文件中<bean id="userDao" class="com.hulei/annotation.UserDaoImpl"/>
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("userDao.save()");
    }
}
