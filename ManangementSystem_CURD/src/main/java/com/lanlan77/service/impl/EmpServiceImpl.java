package com.lanlan77.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanlan77.mapper.EmpMapper;
import com.lanlan77.pojo.Emp;
import com.lanlan77.pojo.PageBean;
import com.lanlan77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    /*@Override
    public PageBean page(Integer page, Integer pageSize) {
        //1. 获取总记录数
        Long count = empMapper.count();
        //2. 获取分页查询的结果列表
        Integer start = (page-1)*pageSize;
        List<Emp> empList  =empMapper.page(start,pageSize);
        //3. 封装pageBean对象
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }*/

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        //1. 设置分页参数
        PageHelper.startPage(page, pageSize);
        //2. 执行查询操作
        List<Emp> empList = empMapper.list();
        //3. 使用 PageInfo 封装分页信息
        PageInfo<Emp> pageInfo = new PageInfo<>(empList);
        //4. 封装 PageBean 对象
        PageBean pageBean = new PageBean(pageInfo.getTotal(), pageInfo.getList());
        return pageBean;
    }
}
