package com.example.curdoperations;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import models.employee;

public class main1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaunit");
        EntityManager em = emf .createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
			List<employee> l = em.createQuery("from employee" , employee.class).getResultList()
					;
			for(employee e : l) {
				System.out.println("id :" + e.getId()+ "email : " + e.getEmail() + "password : " + e.getPassword() );
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			emf.close();
			em.close();
		}

	}

}
