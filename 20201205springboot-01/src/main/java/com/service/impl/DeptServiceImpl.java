package com.service.impl;
import com.mapper.DeptMapper;
import com.model.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    //在业务层调用数据持久层,通过注解注入进来

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept queryDeptById(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
