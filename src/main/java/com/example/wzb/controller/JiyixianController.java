package com.example.wzb.controller;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.service.JiyixianService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "这是JiyixianController")
@RequestMapping("/jiyixian")
public class JiyixianController {
    @Autowired
    private JiyixianService indexService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation(value = "列表方法",httpMethod = "POST")
    public List<Jiyixian>  list(Jiyixian jiyixian){

        return indexService.queryList();
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增",httpMethod = "POST")
    public void insert(Jiyixian jiyixian){

         indexService.insert(jiyixian);
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改",httpMethod = "POST")
    public void update(Jiyixian jiyixian){

         indexService.update(jiyixian);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除",httpMethod = "POST")
    public void  delete(Long id){

         indexService.delete(id);
    }
}
