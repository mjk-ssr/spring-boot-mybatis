package com.mjk.springboot.controller;

import com.mjk.springboot.bean.Department;
import com.mjk.springboot.bean.Employee;
import com.mjk.springboot.mapper.DepartmentMapper;
import com.mjk.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDeptById(id);
        System.out.println(dept);
        return dept;
    }

    @GetMapping("/dp/{id}")
    public Employee getEmpDeptById(@PathVariable("id") Integer id){
        Employee employee = employeeMapper.getEmpDeptById(id);
        return employee;
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        Employee empById = employeeMapper.getEmpById(id);
        System.out.println("sssss"+empById);
        return empById;
    }

    @GetMapping("/emp")
    public Employee insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
