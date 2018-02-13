package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDAO;
import com.example.domain.Exam;
import com.example.domain.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired

    private  UserDAO userDAO;


@Transactional

public List<User>  getUser(){
	
	System.out.println("4 call service user get userserviceimpl method");
	return userDAO.getUser();
	//return true;
}



public List<Exam>  getExamDetails(){

	return userDAO.getExamDetails();
	//return true;
}

}
