package cn.mystic.domain;

import lombok.Data;

/**
 * Created by lihao on 2017/10/16.
 */
@Data
public class Person {

    private Long id;

    private String username; // 用户名

    private Integer age; // 年龄

    private String address; // 地址

    public Person(){}
}
