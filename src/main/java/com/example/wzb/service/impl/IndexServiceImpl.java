package com.example.wzb.service.impl;

import com.example.wzb.entity.TPayBill;
import com.example.wzb.mapper.Indexmapper;
import com.example.wzb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
   @Autowired
   private Indexmapper indexmapper;

    @Override
    public List<TPayBill> queryList() {
        List<TPayBill> tPayBills = indexmapper.queryList();
        return tPayBills;
    }
}
