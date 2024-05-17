package com.lanlan77.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分页查询结果封装类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
    private long total; // 总记录数
    private List rows; //  数据列表

}


/*

-- 分页查询语法
        -- 参数1：起始索引 = （页面-1）* 每页展示的记录数
        -- 参数2：查询返回记录数 = 每页展示记录数

        select * from dept limit 0,5;

        -- 查询第一页数据，每页展示5条记录
        select * from dept limit 5,5;

        -- 查询第2页数据，每页展示5条记录
        select * from dept limit 1,5;

        -- 查询第3页数据，每页展示5条记录
        select * from dept limit 10,5;

        -- 获取总记录数
        select count(*) from dept;*/
