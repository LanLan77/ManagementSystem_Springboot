package com.lanlan77.mapper;

import com.lanlan77.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.time.LocalDate;
import java.util.List;

@MapperScan("com.lanlan77.mapper")
public interface EmpMapper {
//    /**
//     * 查询总记录数
//     * @return
//     */
//    @Select("select count(*) from emp;")
//    public long count();
//
//
//    /**
//     * 分页查询获取列表数据
//     * @param start
//     * @param pageSize
//     * @return
//     */
//    @Select("select * from emp limit #{start},#{pageSize };")
//    public List<Emp> page(Integer start, Integer pageSize);

    /**
     * 员工信息查询
     * @return
     */
    //@Select("select * from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 批量删除的操作
     * @param ids
     */
    void delete(List<Integer> ids);
}
