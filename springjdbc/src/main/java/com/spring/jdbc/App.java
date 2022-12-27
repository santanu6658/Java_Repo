package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started........");
//spring jdbc=> jdbcTemplate
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		//	JdbcTemplate template=	context.getBean("jdbcTemplate",JdbcTemplate.class);
//	//insert query
//String query="insert into student(id,name,city) values(?,?,?)";
// int result=template.update(query,45,"santanu","jharkhand");
// System.out.println("no of record inserted==="+result);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//***************************insert	////////////////////////	
		Student student = new Student();
		student.setId(661);
		student.setCity("lucknow");
		student.setName("ssrikant");
		int result = studentDao.insert(student);
		System.out.println("student added " + result);

		// *********update*******

//		Student student=new Student();
//		student.setId(666); 
//		student.setCity("gurio");
//		student.setName("vinita");
//		int result=studentDao.change(student);
//		System.out.println("data changed "+result);

		// -------------delete-----------
		// Student student=new Student();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the Student ID you want to Delete:");
//		int id = sc.nextInt();
//
//		sc.close();
//
//		int result = studentDao.delete(id);
//		System.out.println("deleted" + result)

		//+++++++++++++++++++fetch (SELECT) single data++++++++++++++++++++++++
	//	Student student= studentDao.getStudent(222);
		
	//-----------------------select multiple data-------------	
		List<Student> students=studentDao.getAllStudents();
		for(Student s:students) {
			System.out.println(s);
		}
		
		
		

		((ConfigurableApplicationContext) context).close();
	}
}
