package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.domain.Exam;
import com.example.domain.User;
import com.example.service.UserService;

@Controller
@RestController
public class UserController {

    @Autowired

	private  UserService userService;
    @RequestMapping(value = "/userdetails", method = RequestMethod.GET, headers = "Accept=application/json")
	
	 public List <User> getUser() {
		
		List<User> userList = userService.getUser();

		 return userList;
	}
    
	

	@RequestMapping(value = "/examdetails", method = RequestMethod.GET, headers = "Accept=application/json")	
    public List <Exam> getExamDetails() {

		List <Exam> customerList = userService.getExamDetails();		
		return customerList;
	}

	}


