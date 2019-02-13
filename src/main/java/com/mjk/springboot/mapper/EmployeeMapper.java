package com.mjk.springboot.mapper;

import com.mjk.springboot.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public Employee getEmpDeptById(Integer id);

    public int deleteEmpById(Integer id);

    public int insertEmp(Employee employee);

    public int updateEmp(Employee employee);
}
