package com.springboot.lzp.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:46
 * @Description:
 */

public interface BaseService<T,ID>{
    List<T> findBy(String columnName,Object value);

    @Transactional
    void deleteBy(String columnName,Object value);
}