package com.springboot.lzp.controller;

import com.springboot.lzp.repository.BaseRepository;
import com.springboot.lzp.service.Impl.BaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

;


/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:55
 * @Description:
 */

public class BaseControllerImpl<T,ID extends Serializable> extends BaseImpl<T,ID> {
    @Autowired
    private BaseRepository<T,ID> baseRepository;

    @PostMapping("/save")
    public T save(@RequestBody T t){
        baseRepository.save(t);
      return t;
    }

    @RequestMapping("/saveAll")
    public List<T> saveAll(@RequestBody List<T> ts){
        baseRepository.saveAll(ts);
        return ts;
    }

    @RequestMapping("deleteById")
    public void deleteById(ID id){
        baseRepository.deleteById(id);
    }

    @RequestMapping("/deleteBy/{columnName}")
    public void deleteBy(@PathVariable(name = "columnName") String columnName, @RequestParam(name = "value") Object value) {
        super.deleteBy(columnName,value);
    }

    @RequestMapping("/findAll")
    public List<T> findAll(){
        List<T> ts= baseRepository.findAll();
        return ts;
    }

    @RequestMapping("/findById")
    public T findById(ID id){
        return  (T) baseRepository.findById(id);
    }


    @RequestMapping("/findAllById")
    public List<T> findAllById(List<ID> ids){
        List<T> ts= baseRepository.findAllById(ids);
        return ts;
    }

    @RequestMapping("/findBy/{columnName}")
    public List<T> findBy(@PathVariable(name = "columnName") String columnName, @RequestParam(name = "value") Object value) {
       return super.findBy(columnName,value);
    }
}