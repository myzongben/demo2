package com.example.wzb.service;

import com.example.wzb.entity.Jiyixian;

import java.util.List;

public interface JiyixianService {
    List<Jiyixian> queryList();
    void insert(Jiyixian jiyixian);
    void delete(Long id);
    void update(Jiyixian jiyixian);
}
