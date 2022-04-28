package com.edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) 
	{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
	    EntityManager em=emf.createEntityManager();
	    
	   JpaStudent sob=em.find(JpaStudent.class,2);
	    System.out.println(sob);
	  
	    //insert
	    
	  JpaStudent ob=new JpaStudent();
	    ob.setSid(3);
	    ob.setSname("devi");
	    ob.setCourse("IT");
	    em.getTransaction().begin();
	   
	    em.persist(ob);
	   em.getTransaction().commit();
	  
	  }


	}


