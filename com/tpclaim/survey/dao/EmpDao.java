package com.tpclaim.survey.dao;

import java.util.List;

import com.tpclaim.survey.vo.Emp;

public interface EmpDao {
	List<Emp>  FindEmpById(Integer emp_id);
}
