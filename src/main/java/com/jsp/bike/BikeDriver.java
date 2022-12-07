package com.jsp.bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sumit");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Bike bike= new Bike();
	bike.setBrand("Duke");
	bike.setName("KTM");
	
	entityTransaction.begin();
	entityManager.persist(bike);
	entityTransaction.commit();
}
}
