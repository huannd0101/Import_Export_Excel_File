package com.example.csv_springboot.service;

import com.example.csv_springboot.dao.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();
}
