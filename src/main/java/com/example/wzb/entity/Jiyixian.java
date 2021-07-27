package com.example.wzb.entity;

import com.alibaba.druid.proxy.jdbc.JdbcParameter;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName(value = "wzb_jiyixian")
public class Jiyixian implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String message;
    private String url;
    private String other;
    private String create_time;
    private String update_time;
    private String shangxian_time;
    private Long redmine_no;

}
