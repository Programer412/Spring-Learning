package com.gaurav;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.gaurav.dao.StudentDao;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		
		/*
		 * HibernateTemplate temp= context.getBean("template",HibernateTemplate.class);
		 * System.out.println(temp);
		 */
		 

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		/*
		 * Student st=new Student(); st.setId(2); st.setName("hello");
		 * st.setAddress("usa");
		 */

		/*
		 * int i= dao.saveStudent(st); System.out.println("insert Successfully" + i);
		 */

		/*
		 * Student st=dao.getStudent(2); System.out.println(st);
		 */

		/*
		 * List<Student> list=dao.getAllStudent();
		 * 
		 * for(Student st:list) { System.out.println(st); }
		 */

		/*
		 * Student st=new Student(); st.setId(2); st.setName("hello");
		 * st.setAddress("usa"); dao.updateStudent(st);
		 * System.out.println("update sucessfully");
		 */

		// dao.deleteStudent(2);
		Student st = new Student();

		st.setId(3);

		st.setName("gaurav");
		st.setAddress("India");

		int i = dao.saveStudent(st);
		System.out.println("insert Successfully" + i);

		List<Student> list = dao.getAllStudent();
		for (Student t : list) {
			System.out.println(t);
		}
	}
}
