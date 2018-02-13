package com.example.service;

import java.util.List;

import com.example.domain.Exam;
import com.example.domain.User;

public interface UserService {
	

	public List  <User> getUser();
	public List<Exam> getExamDetails();
	

}
