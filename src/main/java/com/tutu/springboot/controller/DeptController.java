package com.tutu.springboot.controller;

import com.tutu.springboot.bean.Department;
import com.tutu.springboot.bean.Employee;
import com.tutu.springboot.mapper.DepartmentMapper;
import com.tutu.springboot.mapper.EmployeeMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {

    @Resource
    EmployeeMapper employeeMapper;

    @Resource
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id ) {
        return employeeMapper.getEmpById(id);
    }
}
