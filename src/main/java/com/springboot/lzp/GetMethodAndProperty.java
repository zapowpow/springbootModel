package com.springboot.lzp;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/1/23 10:48
 * @Description:
 */

public class GetMethodAndProperty{

    public static String findId(Class clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            try {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(),clazz);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String[] args) {
//        User user = new User();
//        user.setId((long)1);
//        user.setName("123");
//        List<User> list = new ArrayList<>();
//        list.add(user);
//        user.setId((long)2);
//        findId(User.class);
//        System.out.println("123");
//        GetMethodAndProperty.draft();
        List<Integer> s= new ArrayList<>();
        GetMethodAndProperty g = new GetMethodAndProperty();
        List<Integer> p= g.find(1);
    }

    public static void draft(){

    }

    public <T>List<T> find(T tClass){
        List<T> s = new ArrayList<>();
        s.add(tClass);

        List<? super Number> p = new ArrayList<>();
        p.add(1);
        p.add((long)6);
        return s;
    }

}