package com.lg.entity;


/**
 * @author zxb
 * @date 2021-05-10 23:08
 **/
public class User {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private Integer sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public User() {
    }

    public User(Integer id, String name, String password, Integer age, Integer sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
