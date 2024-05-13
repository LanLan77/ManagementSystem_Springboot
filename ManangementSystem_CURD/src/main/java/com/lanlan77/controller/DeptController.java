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
@RequestMapping("/depts")
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
    @GetMapping
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
    @DeleteMapping("{id}")
    public Result Delete(@PathVariable Integer id ){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     *新增部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody  Dept dept ){
        log.info("新增部门：{}",dept );
        //调用service新增部门
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据id查询部门数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result select(@PathVariable Integer id){//记得加这个注解！！@PathVariable表示从url路径中给id赋值
        //日志记录
        log.info("根据id查询部门信息");
        //调用service层功能
        Dept dept = deptService.select(id);
        //响应
        return Result.success(dept);
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Dept dept){
        //日志记录
        log.info("修改部门信息");
        //调用service层功能
        deptService.update(dept);
        //响应
        return Result.success();
    }
}
