package com.springboot.lzp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/4/12 9:56
 * @Description:
 */
@RestController
public class DraftController {

    @RequestMapping(value = {"/","/say"})
    public String say(@RequestParam(name = "value",defaultValue = "success",required = false) String value){
        return value;
    }
}