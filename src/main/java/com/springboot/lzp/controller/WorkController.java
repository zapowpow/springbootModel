package com.springboot.lzp.controller;

import com.springboot.lzp.entity.Work;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/1/2 16:18
 * @Description:
 */
@RestController
@RequestMapping("work")
public class WorkController extends BaseControllerImpl<Work,Integer>{

}