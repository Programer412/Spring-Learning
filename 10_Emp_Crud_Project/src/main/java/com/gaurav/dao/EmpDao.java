package com.gaurav.dao;

import java.util.List;

import com.gaurav.entity.Emp;

public interface EmpDao {

	public int saveEmp(Emp emp);
	public Emp getEMpById(int id);
	
	public List<Emp> getAllEmp(); 
	
	public void update(Emp emp);
	
	public void deleteEmp(int id);
	
	
}
