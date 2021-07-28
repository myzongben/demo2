package com.example.wzb.service.impl;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.mapper.JiyixianMapper;
import com.example.wzb.service.JiyixianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiyixianServiceImpl  implements JiyixianService {
   @Autowired
   private JiyixianMapper jiyixianmapper;


    @Override
    public List<Jiyixian> queryList(Jiyixian jiyixian) {
        return jiyixianmapper.queryList(jiyixian);
    }

    @Override
    public void insert(Jiyixian jiyixian) {
        jiyixianmapper.add(jiyixian);
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
