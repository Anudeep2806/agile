package com.agileprojectmanagement.projectmanagement.resources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resources {
	
	  @Id
	  @Column(name="userId",length=6)
      private String userId;
	  @Column(name="firstName",length=15)
      private String firstName;
	  @Column(name="lastName",length=15)
      private String lastName;
	  @Column(name="email",length=50)
      private String email;
	  @Column(name="phno",length=10)
      private String phno;
	  @Column(name="role",length=20)
      private String role;
	  @Column(name="projectCode",length=10)
      private long projectCode;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(long projectCode) {
		this.projectCode = projectCode;
	}
	public Resources() {
		super();
	}
	public Resources(String userId, String firstName, String lastName, String email, String phno, String role,
			long projectCode) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
		this.role = role;
		this.projectCode = projectCode;
	} 
	
}
