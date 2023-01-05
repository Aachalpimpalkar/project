package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Aachal");
		
		Address homeAddress=new Address();
		 homeAddress.setStreet("MG road");
		 homeAddress.setCity("Akola");
		 homeAddress.setState("Maharashtra");
		 homeAddress.setZipcode("444001");
		
		 student.setAddress(homeAddress);
		 em.persist(student);
		 
		 em.getTransaction().commit();
		 
		 em.close();
		 factory.close();
		
	}

}
