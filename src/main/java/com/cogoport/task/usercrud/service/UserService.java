package com.cogoport.task.usercrud.service;

import com.cogoport.task.usercrud.model.User;
import com.cogoport.task.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    /**
     * User Repository.
     */
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Method to fetch all the student details.
     *
     * @return List of all Students.
     */
    public List<User> getAll() {
        return userRepository.findAll();
    }

    /**
     * Method to fetch student details by id.
     *
     * @return List of all Students.
     */
    public List<User> getByID(Integer id) {
        return userRepository.findAllById(Collections.singleton(id));
    }

    /**
     * Method to delete the student details.
     *
     * @return Http Status.
     */
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    /**
     * Method to add new student details.
     *
     * @return Http Status.
     */
    public void addUser(User user) {
        userRepository.save(user);
    }

    /**
     * Method to update the student details.
     *
     * @return Http Status.
     */
    public void updateUser(User data) {
        int id = data.getId();
        Optional<User> list = userRepository.findById(id);
        User user = list.get();
        user.setEmailId(data.getEmailId());
        user.setFirstName(data.getFirstName());
        user.setLastName(data.getLastName());
        user.setPhone(data.getPhone());
        user.setCollege(data.getCollege());
        userRepository.save(user);
    }
}
