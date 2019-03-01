package com.springboot.lzp.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:12
 * @Description:
 */
@Entity
@Table(name = "user")
@SecondaryTable(name = "b_user",pkJoinColumns = {@PrimaryKeyJoinColumn(name = "WORK_ID")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String name;
    @Column(table = "b_user",name = "USER_AGE")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @OneToMany
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}