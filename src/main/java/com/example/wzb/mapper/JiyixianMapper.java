package com.example.wzb.mapper;

import com.example.wzb.entity.Jiyixian;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//@Mapper
public interface JiyixianMapper {

    List<Jiyixian> queryList(Jiyixian jiyixian);
    @Insert("INSERT INTO wzb_jiyixian(message,url,other)  VALUES (#{message}, #{url}, #{other}) ")
    void add(Jiyixian jiyixian);
    @Update("update wzb_jiyixian set message=#{message}, url=#{url} , other=#{other} where id=#{id}")
    void update(Jiyixian jiyixian);


    @Delete("delete from  wzb_jiyixian where id=#{id}")
    void delete(Long id);
}