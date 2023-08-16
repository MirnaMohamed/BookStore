//package com.example.demo.services;
//
//import com.example.demo.models.entities.User;
//import com.example.demo.exceptions.NotExistException;
//import com.example.demo.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
//    private UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void saveUser(User user) {
//        userRepository.save(user);
//    }
//
//    @Override
//    public User getUserByUsernameAndPassword(String name, String password) throws NotExistException {
//        User user = userRepository.findUserByUsernameAndPassword(name, password);
//        if (user == null) {
//            throw new NotExistException("Invalid id and password");
//        }
//        return user;
//    }
//}