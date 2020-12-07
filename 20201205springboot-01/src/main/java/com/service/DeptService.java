package com.service;

import com.model.Dept;

public interface DeptService {

    //根据部门id查询详情
    Dept queryDeptById(Integer id);
}
