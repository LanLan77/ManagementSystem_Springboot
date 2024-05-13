package com.lanlan77.controller;

import com.lanlan77.pojo.Dept;
import com.lanlan77.pojo.Result;
import com.lanlan77.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    /**
     * 查询部门信息
     * @return
     */
    //获取日志记录对象
    /*private static Logger log = LoggerFactory.getLogger(DeptController.class);*/
    //@RequestMapping(value = "/depts",method = RequestMethod.GET) //指定请求方式为get
    @GetMapping ("depts")
    public Result list(){
        //用logback记录日志
        log.info("查询全部部门数据");

        //调用service查询部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/depts/{id}")
    public Result Delete(@PathVariable Integer id ){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }
}
