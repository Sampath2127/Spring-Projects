package com.lovecoding.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lovecoding.hibernateEntity.Student;

public class TestJDBC {

	public static void main(String[] args) {

			/*	String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
				String user="hbstudent";
				String pwd="hbstudent";
				
			try{
					Connection myConn=DriverManager.getConnection(jdbcUrl,user,pwd);
					
					System.out.println("Connection Sucessful..!");
			}catch(Exception ex)
			{
				System.out.println(ex.getLocalizedMessage());
			}*/
		
		SessionFactory factory=new Configuration().configure() //can use .configure("hibernate-cfg file path")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		Student student1 = new Student("Laxmi", "Komsani", "laxmi.komsani@gmail.com");
		Student student2 = new Student("Laxmi", "Komsani", "laxmi.komsani@gmail.com");
		Student student3 = new Student("Laxmi", "Komsani", "laxmi.komsani@gmail.com");
		Student student4 = new Student("Laxmi", "Komsani", "laxmi.komsani@gmail.com");
		try{
		session.beginTransaction();
		session.save(student1);
		session.getTransaction().commit();
		System.out.println("Student saved..!");
		}
		finally{
			session.close();
			factory.close();
		}
		
	}

}
