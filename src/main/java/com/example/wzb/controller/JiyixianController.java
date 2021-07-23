package com.example.wzb.controller;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.paramDTO.Result;
import com.example.wzb.service.JiyixianService;
import com.example.wzb.service.impl.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "这是JiyixianController")
@RequestMapping("/jiyixian")
public class JiyixianController {
    @Autowired
    private JiyixianService indexService;
    @Resource
    private CommonService<Jiyixian> commonService;
/**
 *  @author: wangzongben
 *  @Date: 2021/7/23 10:46
 *  @Description:  前段是{ddd:dd,...}这类参数，后台接收时，采用@RequestBody
 */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation(value = "列表方法",httpMethod = "POST")
    public Result  list(@RequestBody Jiyixian jiyixian){
        try {
            //QueryWrapper<Jiyixian> wrapper = new QueryWrapper<>();
            //List list = commonService.list(wrapper);

            return Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
           return  Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增",httpMethod = "POST")
    public Result insert(Jiyixian jiyixian){

        try {
            indexService.insert(jiyixian);
          return  Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
          return  Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改",httpMethod = "POST")
    public Result update(Jiyixian jiyixian){
        try {
            indexService.update(jiyixian);
            return Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除",httpMethod = "POST")
    public Result  delete(Long id){

        try {
            indexService.delete(id);
            return Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(500,e.getMessage());
        }
    }
}
