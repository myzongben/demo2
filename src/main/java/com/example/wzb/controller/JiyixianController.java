package com.example.wzb.controller;

import com.example.wzb.entity.Jiyixian;
import com.example.wzb.paramDTO.Result;
import com.example.wzb.service.JiyixianService;
import com.example.wzb.service.CommonService;
import com.example.wzb.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Api(value = "这是JiyixianController")
@RequestMapping("/jiyixian")
public class JiyixianController {
    @Autowired
    private JiyixianService indexService;
    @Resource
    private RedisUtil redisUtil;
/**
 *  @author: wangzongben
 *  @Date: 2021/7/23 10:46
 *  @Description:  前段是{ddd:dd,...}这类参数，后台接收时，采用@RequestBody
 */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "列表方法",httpMethod = "GET")
    public Result  list( Jiyixian jiyixian){
        try {
            List<Jiyixian> jiyixians = indexService.queryList(jiyixian);
            return Result.ok(jiyixians);
        } catch (Exception e) {
            e.printStackTrace();
           return  Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增",httpMethod = "POST")
    public Result insert(@RequestBody Jiyixian jiyixian){

        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            jiyixian.setCreate_time(simpleDateFormat.format(new Date()));
            indexService.insert(jiyixian);
          return  Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
          return  Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改",httpMethod = "POST")
    public Result update(@RequestBody Jiyixian jiyixian){
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
    @RequestMapping(value = "/redisAdd",method = RequestMethod.POST)
    @ApiOperation(value = "评论保存",httpMethod = "POST")
    public Result  redisAdd(@RequestBody Map<String,Object> map){

        try {
            redisUtil.set("article"+map.get("articleId"),map);
            return Result.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(500,e.getMessage());
        }
    }
    @RequestMapping(value = "/redisList",method = RequestMethod.GET)
    @ApiOperation(value = "列表方法",httpMethod = "GET")
    public Result  redisList(String articleId){
        try {
            Map o = (Map) redisUtil.get("article" + articleId);
            return Result.ok(o);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.fail(500,e.getMessage());
        }
    }
}
