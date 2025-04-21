package com.example.curdoperations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import models.employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaunit");
        EntityManager em = emf .createEntityManager();
        EntityTransaction et = em.getTransaction();
        employee e2 = new employee();
        e2.setEmail("hai@gmail.com");
        e2.setPassword("64856475");
        try {
			et.begin();
			em.persist(e2);
			et.commit();
			System.out.println("successfully inserted");
//        	int id = 2;
//        	et.begin();
//        	employee e = em.find(employee.class, id);
//        	if (e!=null) {
//				em.remove(e);
//				System.out.println("successfully deleted");
//				et.commit();
//        		e.setEmail("hai@gmail.com");//getemail
//        		e.setPassword("64856475");//getpassword
//        		em.merge(e);
//        		et.commit();
//        		System.out.println("data updated successfully");


			
        }
        	catch (Exception e) {
			e.printStackTrace();
		}finally {
			emf.close();
	        em.close();
		}
    }
}
