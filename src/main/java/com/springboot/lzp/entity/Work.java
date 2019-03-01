package com.springboot.lzp.entity;

import javax.persistence.*;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/1/2 16:16
 * @Description:
 */
@Entity
@Table(name = "work")
public class Work{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WORK_ID")
    private long workId;
    @Column(name = "WORK_NAME")
    private String workName;
    @Column(name = "WORK_AGE")
    private Long workAge;

    public long getWorkId() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Long getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Long workAge) {
        this.workAge = workAge;
    }
}