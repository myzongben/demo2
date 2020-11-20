package com.example.wzb.controller;

import com.example.wzb.entity.TPayBill;
import com.example.wzb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/list")
    public List<TPayBill>  list(){
        return indexService.queryList();
    }
}
