package com.example.dao;

import java.util.List;

import com.example.domain.Exam;
import com.example.domain.User;

public interface UserDAO {

public List  <User> getUser();
public List <Exam> getExamDetails();
}
