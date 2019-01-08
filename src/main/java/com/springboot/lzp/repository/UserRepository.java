package com.springboot.lzp.repository;

import com.springboot.lzp.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 11:01
 * @Description:
 */
@Repository
public interface UserRepository extends BaseRepository<User,Integer>{

}