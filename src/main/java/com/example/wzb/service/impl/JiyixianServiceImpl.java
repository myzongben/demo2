package com.example.wzb.service.impl;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.entity.TPayBill;
import com.example.wzb.mapper.Indexmapper;
import com.example.wzb.mapper.Jiyixianmapper;
import com.example.wzb.service.IndexService;
import com.example.wzb.service.JiyixianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiyixianServiceImpl implements JiyixianService {
   @Autowired
   private Jiyixianmapper jiyixianmapper;


    @Override
    public List<Jiyixian> queryList() {
        return jiyixianmapper.queryList();
    }

    @Override
    public void insert(Jiyixian jiyixian) {
        jiyixianmapper.insert(jiyixian);
    }

    @Override
    public void delete(Long id) {
        jiyixianmapper.delete(id);

    }

    @Override
    public void update(Jiyixian jiyixian) {
        jiyixianmapper.update(jiyixian);

    }
}
