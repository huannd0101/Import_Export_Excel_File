package com.example.csv_springboot.service.imp;

import com.example.csv_springboot.dao.User;
import com.example.csv_springboot.repository.UserRepository;
import com.example.csv_springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
