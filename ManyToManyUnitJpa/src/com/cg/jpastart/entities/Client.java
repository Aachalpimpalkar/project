package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public  static  void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department = new Department();
		department.setId(10);
		department.setName("C2Tc");
		
		Employee e1 = new Employee();
		e1.setName("priyanka");
		e1.setSalary(450);
		
		department.addEmployee(e1);
		em.persist(department);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

	
}
