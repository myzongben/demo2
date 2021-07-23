package com.example.wzb.controller;

import com.example.wzb.entity.TPayBill;
import com.example.wzb.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "这是IndexController")
public class IndexController {
    @Autowired
    private IndexService indexService;
    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation(value = "列表方法",httpMethod = "POST")
    public List<TPayBill>  list(String account, String checkPass){

        return indexService.queryList();
    }
}
