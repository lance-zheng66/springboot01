package com.web;


import com.model.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//控制层
@Controller
public class DeptController {


    @Autowired
    private DeptService deptService;


    @RequestMapping("/dept")
    public @ResponseBody Object dept(Integer id){
        Dept dept = deptService.queryDeptById(id);
        return dept;
    }
}
