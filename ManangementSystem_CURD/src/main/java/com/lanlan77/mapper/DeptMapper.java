package com.lanlan77.mapper;

import com.lanlan77.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门数据
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();
}
