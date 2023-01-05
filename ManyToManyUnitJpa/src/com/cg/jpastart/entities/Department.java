package com.cg.jpastart.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPT_MASTER")

public class Department {
@Id
private int id;
private String name;
@ManyToMany(mappedBy="department",cascade=CascadeType.ALL)
private Set<Employee> employee = new HashSet<>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Employee> getEmployee() {
	return employee;
}
public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}
public void addEmployee(Employee employee) {
	employee.setDepartment(this);
	this.getEmployee().add(employee);
}




}
