package com.agileprojectmanagement.projectmanagement.projects;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.agileprojectmanagement.projectmanagement.Clients.Clients;
import com.agileprojectmanagement.projectmanagement.resources.Resources;


@Entity 
public class Projects {
	
	    @Id
	    @Column(name="projectCode",length=10)
        private long projectCode;
	    @Column(name="title",length=50)
        private String title;
	    @Column(name="budget",length=10)
        private long budget;
        private LocalDate startDate;
        private LocalDate expectedEndDate;
        private LocalDate createdOn;
        @Column(name="status",length=20)
        private String status;
        private LocalDate lastUpdatedOn;
        
        @ManyToOne(targetEntity = Clients.class,cascade = CascadeType.ALL)
        @JoinColumn(name="ClientId",referencedColumnName = "id")
        private Clients clients;

	    @OneToMany(mappedBy = "projects",cascade = CascadeType.ALL)
		private List<Resources> resources;

	public long getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(long projectCode) {
		this.projectCode = projectCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpectedEndDate() {
		return expectedEndDate;
	}

	public void setExpectedEndDate(LocalDate expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Clients getClients() {
		return clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public List<Resources> getResources() {
		return resources;
	}

	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}

	public Projects(long projectCode, String title, long budget, LocalDate startDate, LocalDate expectedEndDate, LocalDate createdOn, String status, LocalDate lastUpdatedOn, Clients clients, List<Resources> resources) {
		this.projectCode = projectCode;
		this.title = title;
		this.budget = budget;
		this.startDate = startDate;
		this.expectedEndDate = expectedEndDate;
		this.createdOn = createdOn;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.clients = clients;
		this.resources = resources;
	}

	public Projects() {
		super();
	}
}
