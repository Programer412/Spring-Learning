package com.gaurav.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gaurav.entity.Emp;
@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveEmp(Emp emp) {
		// TODO Auto-generated method stub
		int i=(Integer) hibernateTemplate.save(emp);
		return i;
	}

	
	public Emp getEMpById(int id) {
		Emp em=(Emp)hibernateTemplate.get(Emp.class,id);
		return em;
	}

	
	public List<Emp> getAllEmp() {
		List<Emp> list=hibernateTemplate.loadAll(Emp.class);
		
		return list;
	}

	@Transactional
	public void update(Emp emp) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(emp);
		
	}

	@Transactional
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		Emp em=hibernateTemplate.get(Emp.class,id);
	
	hibernateTemplate.delete(em);
	
	}

}
