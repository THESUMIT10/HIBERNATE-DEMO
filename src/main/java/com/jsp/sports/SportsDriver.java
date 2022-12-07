package com.jsp.sports;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsDriver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sumit");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction= entityManager.getTransaction();
    
    Sports sports= new Sports();
    sports.setId(1);
    sports.setName("Cricket");
    
    entityTransaction.begin();
    entityManager.persist(sports);
    entityTransaction.commit();
    System.out.println("All good");
}
}
