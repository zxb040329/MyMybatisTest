package com.lg.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zxb
 * @date 2021-05-10 23:08
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private Integer sex;

}
