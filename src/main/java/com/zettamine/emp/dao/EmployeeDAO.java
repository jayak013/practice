package com.zettamine.emp.dao;

import com.zettamine.emp.dto.Employee;

public interface EmployeeDAO {
	
	void findEmpById(Integer id);
	
	void updateEmpById(Integer id,Employee emp);
	
	void deleteEmpById(Integer id);
	
}
