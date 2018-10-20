package com.tpclaim.survey.dao.impl;

import java.util.List;

import com.claim.base.CommonDao;
import com.tpclaim.survey.dao.EmpDao;
import com.tpclaim.survey.vo.Emp;


public class EmpDaoImpl extends CommonDao implements EmpDao  {
   
	
	public List<Emp> FindEmpById(Integer emp_id) {
		String sql = " select * from emp_zhao ";
		//Object[] args = { emp_id };
		List<Emp> list = null;
		
		 list = this.getJdbcTemplate().queryForList(sql);
          System.out.println(list.isEmpty());
		return list;
	}
}
