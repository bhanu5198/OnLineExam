package com.example.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDAO;
import com.example.domain.Exam;
import com.example.domain.User;


@Repository
@Transactional

public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	

	@SuppressWarnings("unchecked")
	public List<User> getUser() {
		
	      Query query = entityManager.createQuery( "From  User AS E  ");
	      List<User> list= (List<User>)query.getResultList( );
		return list;
	}
	
	public List<Exam> getExamDetails(){
		Query query = entityManager.createQuery( "From Exam AS E ");
		
	     @SuppressWarnings("unchecked")
		List<Exam> list=(List<Exam>)query.getResultList();
		return list;
	}
	
}
