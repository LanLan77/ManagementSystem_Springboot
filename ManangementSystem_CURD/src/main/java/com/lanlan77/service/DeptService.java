package com.lanlan77.service;

import com.lanlan77.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DeptService {
    /**
     * 查询全部部门
     * @return
     */
    List<Dept> list();
}
