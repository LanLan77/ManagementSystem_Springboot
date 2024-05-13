package com.lanlan77.service.impl;

import com.lanlan77.mapper.DeptMapper;
import com.lanlan77.pojo.Dept;
import com.lanlan77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
