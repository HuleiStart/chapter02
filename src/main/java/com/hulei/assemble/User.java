package com.hulei.assemble;

import java.util.List;

/**
 * @author Mr.Hu
 * @create 2022/10/18 9:59
 */
public class User {
    private String userName;
    private String password;
    private List<String> list;

    /**
     * 1.使用构造注入
     * 1.1 提供带所有参数的构造方法
     */
    public User(String userName, String password, List<String> list) {
        this.userName = userName;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }



    /**
     * 2.使用设值注入
     * 2.1 提供默认的空参构造方法
     * 2.2 为所有属性提供setter（）方法
     */

    public User() {
        super();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
