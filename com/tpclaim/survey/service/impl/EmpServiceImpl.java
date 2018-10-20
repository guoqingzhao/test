package com.tpclaim.survey.service.impl;

import java.util.List;

import com.tpclaim.survey.dao.EmpDao;
import com.tpclaim.survey.service.EmpService;
import com.tpclaim.survey.vo.Emp;

public class EmpServiceImpl implements EmpService {

	
	private EmpDao empDao;
	
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	
	
	 public List<Emp> selectEmp(Integer emp_id){
		List<Emp> list =empDao.FindEmpById(emp_id);
		for(Emp e:list){
			System.out.println(e.toString());
			
		}
		return list;
	}

	public String update(List<Emp> emplist) {
		return null;
	}

	public String delete() {
		
		return null;
	}
	
}
