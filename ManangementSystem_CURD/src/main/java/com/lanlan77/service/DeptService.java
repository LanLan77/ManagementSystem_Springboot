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


    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据id查询部门数据
     *
     * @param id
     * @return
     */
    Dept select(Integer id);

    /**
     * 修改部门
     * @param dept
     * @return
     */
    void update(Dept dept);
}
