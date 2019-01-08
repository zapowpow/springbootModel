package com.springboot.lzp.controller;

import com.springboot.lzp.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:51
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseControllerImpl<User,Integer>{

    Logger logger =  LoggerFactory.getLogger(User.class);
    @RequestMapping("mapJson")
    public Map mapJson() {
        logger.info("asdd");
        Map<String, Object> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", "asd");
        map.put("three", "123");
        return map;
    }
}