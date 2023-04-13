package com.agileprojectmanagement.projectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.agileprojectmanagement.projectmanagement.projects.Projectsrepo;

@SpringBootApplication
public class ProjectmanagementApplication {

	public static void main(String[] args) {
		ApplicationContext c=SpringApplication.run(ProjectmanagementApplication.class, args);
		//Projectsrepo re=c.getBean(Projectsrepo.class);
		//Projects p=new Projects();	
		
		//re.save(p);
	}

}
