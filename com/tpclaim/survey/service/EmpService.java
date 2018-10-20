package com.tpclaim.survey.service;

import java.util.List;

import com.tpclaim.survey.vo.Emp;

public interface EmpService {
	List<Emp> selectEmp(Integer emp_id);
	
	String update(List<Emp> emplist);
	
	String  delete();
}
