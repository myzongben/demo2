package com.example.wzb.mapper;

import com.example.wzb.entity.TPayBill;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface Indexmapper {
    @Select("select * from t_pay_bill")
    List<TPayBill> queryList();
}
