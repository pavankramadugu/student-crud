package com.cogoport.task.usercrud.service;

import com.cogoport.task.usercrud.model.User;
import com.cogoport.task.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public List<User> getByID(Integer id) {
        return userRepository.findAllById(Collections.singleton(id));
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateFirstName(int id, String firstName) {
        userRepository.updateFirstName(id, firstName);
    }

    public void updateLastName(int id, String lastName) {
        userRepository.updateLastName(id, lastName);
    }

    public void updateEmailId(int id, String emailId) {
        userRepository.updateEmailId(id, emailId);
    }

    public void updatePhone(int id, String phone) {
        userRepository.updatePhone(id, phone);
    }
}
