package com.springboot.lzp.service.Impl;

import com.springboot.lzp.service.BaseService;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:47
 * @Description:
 */
@Service
public class BaseImpl<T,ID extends Serializable> implements BaseService<T,ID> {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List findBy(String columnName, Object value) {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Class entityClass =  (Class)params[0];
        String className =entityClass.getSimpleName();

        String sql="select u from "+className+" u where u."+columnName+" = '"+ value+"'";
        Query query= (Query) entityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public List findAll(Class clazz) {
        javax.persistence.Query query = entityManager.createQuery("select n from " + clazz.getSimpleName() + " n");
        return query.getResultList();
    }

    @Override
    public void deleteBy(String columnName, Object value) {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Class entityClass =  (Class)params[0];
        String className =entityClass.getSimpleName();
        String sql="delete from "+className+" u where u."+columnName+" = '"+ value+"'";
        Query query= (Query) entityManager.createQuery(sql);
        query.executeUpdate();
    }
}