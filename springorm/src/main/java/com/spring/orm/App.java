package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//    Student student=new Student(334,"santanu","delhi");
//    int r=studentDao.insert(student);
//   System.out.println("done" +r);
		((ConfigurableApplicationContext) context).close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new Student");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get detail of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update students");
			System.out.println("PRESS 6 for exit");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// add a new student
					System.out.println("enter user id :");
					int ui = Integer.parseInt(br.readLine());
					System.out.println("enter user name:");
					String uName = br.readLine();
					System.out.println("enter city");
					String uCity = br.readLine();
					Student s=new Student();
					s.setStudentId(ui);
					s.setStudentName(uName);
					s.setCity(uCity);
					int r=studentDao.insert(s);
					System.out.println(r +"  student added");
					System.out.println("****************");
					System.out.println();
		
			
					break;
				case 2:
				List<Student> allStudents=	studentDao.getAllStudents();
				for(Student st:allStudents) {
					System.out.println("id :"+st.getStudentId());
					System.out.println("Name :"+st.getStudentName());
					
					System.out.println("city :"+st.getCity());
					
					
				}
				System.out.println("***********************************");
				break;
				case 3:
					//get single student data
					
					System.out.println("enter user id :");
					int userId = Integer.parseInt(br.readLine());
					Student student=studentDao.getStudent(userId);
					System.out.println("id :"+student.getStudentId());
					System.out.println("Name :"+student.getStudentName());
					System.out.println("city :"+student.getCity());
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					// exit
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input try with anoter one !!");
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Thank u using my application");
		System.out.println("see u soon!!");
	}
}
