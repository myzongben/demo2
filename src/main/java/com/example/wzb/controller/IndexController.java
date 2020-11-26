package com.example.wzb.controller;

import com.example.wzb.entity.TPayBill;
import com.example.wzb.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "这是IndexController")
public class IndexController {
    @Autowired
    private IndexService indexService;
    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "列表方法",httpMethod = "GET")
    public List<TPayBill>  list(){
        return indexService.queryList();
    }
}
