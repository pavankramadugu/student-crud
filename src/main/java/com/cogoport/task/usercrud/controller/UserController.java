package com.cogoport.task.usercrud.controller;

import com.cogoport.task.usercrud.model.User;
import com.cogoport.task.usercrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@RestController
@RequestMapping("/api")
public class UserController {

    /**
     * Service Class.
     */
    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    /**
     * Method to fetch all the student details.
     * @return List of all Students.
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    /**
     * Method to fetch student details by id.
     * @return List of all Students.
     */
    @GetMapping("/getByID/{id}")
    public ResponseEntity<List<User>> getByID(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(service.getByID(id));
    }

    /**
     * Method to delete the student details.
     * @return Http Status.
     */
    @DeleteMapping("/deleteUser/{id}")
    public HttpStatus deleteUser(@PathVariable("id") Integer id) {
        service.deleteUser(id);
        return HttpStatus.ACCEPTED;
    }

    /**
     * Method to add new student details.
     * @return Http Status.
     */
    @PostMapping("/addUser")
    public HttpStatus deleteUser(@RequestBody User user) {
        service.addUser(user);
        return HttpStatus.ACCEPTED;
    }

    /**
     * Method to update the student details.
     * @return Http Status.
     */
    @PutMapping("/updateUser")
    public HttpStatus updateUser(@RequestBody User data) {
        service.updateUser(data);
        return HttpStatus.ACCEPTED;
    }
}
