package com.Employee.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Employee.Management.System.Model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
