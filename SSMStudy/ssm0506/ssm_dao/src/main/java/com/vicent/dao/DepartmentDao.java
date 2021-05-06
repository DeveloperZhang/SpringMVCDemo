package com.vicent.dao;

import com.vicent.entity.Department;
import com.vicent.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();

//    @Repository("employeeDao")
//    interface EmployeeDao {
//        void insert(Employee employee);
//        void update(Employee employee);
//        void delete(String sn);
//        Employee select(String sn);
//        List<Employee> selectAll();
//        List<Employee> selectByDepartmentAndPost(@Param("dsn") String dsn, @Param("post") String post);
//    }
}
