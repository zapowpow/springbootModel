package com.springboot.lzp.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:12
 * @Description:
 */
@Entity(name = "user")
@Table(name = "user")
public class User {
//
//    public enum column{
//        TABLE_NAME("user"),
//        USER_ID("id"),
//        USER_NAME("name"),
//        USER_AGE("age");
//        private String columnName;
//
//        column(String columnName) {
//            this.columnName=columnName;
//        }
//
//        public String getColumnName() {
//            return columnName;
//        }
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;
    @Column(name = "USER_NAME")
    private String name;

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

}