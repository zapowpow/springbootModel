package com.springboot.lzp.httpListener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/4/11 11:07
 * @Description:
 */
@WebListener
public class RequestListener implements ServletRequestListener  {
    private String a;

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("old:"+a);

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        if(a==null){
            a="0";
        }else a="10";
        System.out.println("new:"+a);
    }
}