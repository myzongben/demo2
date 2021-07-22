package com.example.wzb.mapper;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.entity.TPayBill;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//@Mapper
public interface Jiyixianmapper {
    @Select("select * from wzb_jiyixian")
    List<Jiyixian> queryList();
    @Insert("INSERT INTO wzb_jiyixian(message,url,other)  VALUES (#{message}, #{url}, #{other}) ")
    void insert(Jiyixian jiyixian);
    @Update("update wzb_jiyixian set message=#{message}, url=#{url} , other=#{other} where id=#{id}")
    void update(Jiyixian jiyixian);


    @Delete("delete from  wzb_jiyixian where id=#{id}")
    void delete(Long id);
}
