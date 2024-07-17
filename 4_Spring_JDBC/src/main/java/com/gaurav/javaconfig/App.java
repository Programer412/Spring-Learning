package com.gaurav.javaconfig;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.SystemPropertyUtils;

import com.gaurav.dao.StudentDao;
import com.gaurav.dao.StudentDaoImpl;
import com.gaurav.model.Student;

public class App {
	
public static void main(String[] args) throws SQLException {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	 JdbcTemplate jd=context.getBean("jdbc",JdbcTemplate.class);
	 
	  System.out.println(jd.getDataSource().getConnection());
		/*
		 * String sql="insert into student(id,name,address) values(?,?,?)"; int
		 * i=jd.update(sql,7,"vivek","usa");
		 * System.out.println("successfully inserted "+i);
		 */
	 
	
//	String sql="insert into student(id,name,address) values(?,?,?)";
//	
//	int i=jd.update(sql,2,"hello","germany");
//
//	System.out.println("suu" + i);
	
	
/*	insert
	
	String sql="insert into student(id,name,address) values(?,?,?)";
	int i=jd.update(sql,3,"vivek","usa");
	System.out.println("successfully inserted "+i);*/

	
/*
 * update data
 * 
 * String sql="update student set name=?, address=? where id=?";
 * 
 * int i=jd.update(sql,"Rakesh Up","USA up",3);
 * 
 * System.out.println("update successfully "+i);
 */
	
	
/*
 * delete data String sql="delete from student where id=?"; int
 * i=jd.update(sql,3); System.out.println("delete successfully"+i);
 */
	
/*	String sql="select * from student where id=?";

	RowMapper rowMapper=new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	
			String name=rs.getString(2);
			return name;
		}
		
		
	
	};
String name=(String) jd.queryForObject(sql,rowMapper, 1);
System.out.println(name);
}*/
	
	
/*	String sql="select * from student";

	RowMapper rowMapper=new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	
			String name=rs.getString(2);
			return name;
		}
		};
List<String> list=jd.query(sql,rowMapper);
for(String name:list)
{
	System.out.println(name);
}
}*/
/* perform Dao Standard */
	
 StudentDao dao=context.getBean("stDao",StudentDao.class);
	
	
	
	/*
	 * Student st=new Student(); st.setId(6); st.setName("Rak");
	 * st.setAddress("uk");
	 * 
	 * int j=dao.insert(st);
	 * 
	 * System.out.println("insert successfully "+j);
	 */
	 


/*	update
	
Student st=new Student();
st.setId(3);
st.setName("Rakesh");
st.setAddress("uk");

int i=dao.updateDetails(st);

System.out.println("update successfully "+i);

}*/
	
	
/*
 * delete data
 *  int i=dao.delete(3); 
 * System.out.println("delete succesfully"+ i);
 */
	
	
/*
 * Student st=dao.getStudentById(2); System.out.println(st);
 */

  List<Student> list=dao.getAllStudent();
  for(Student t:list) {
  System.out.println(t); }
 
}
	
}
