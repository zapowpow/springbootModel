package com.springboot.lzp.controller;

import com.springboot.lzp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:55
 * @Description:
 */

public class BaseControllerImpl<T,ID extends Serializable> {

    @Autowired
    BaseService<T,ID> base;

    private Class findClass(){
        return (Class) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @RequestMapping("/findAll")
    public List<?> FindAll(){
        return (List<?>) base.findAll(findClass());
    }

}