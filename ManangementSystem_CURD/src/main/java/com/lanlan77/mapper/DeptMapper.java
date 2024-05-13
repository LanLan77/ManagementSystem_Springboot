package com.lanlan77.mapper;

import com.lanlan77.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门数据
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    @Insert("insert into dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);



    /**
     * 根据Id查询部门数据
     * @param id
     * @return
     */
    @Select("select * from dept where id = #{id}")
    Dept selectById(Integer id);

    /**
     * 修改部门信息
     * @param dept
     */
    @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);


}
