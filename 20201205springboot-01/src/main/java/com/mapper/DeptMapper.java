package com.mapper;

import com.model.Dept;
import org.apache.ibatis.annotations.Mapper;
//扫描到接口到Sprin容器

@Mapper
public interface DeptMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}