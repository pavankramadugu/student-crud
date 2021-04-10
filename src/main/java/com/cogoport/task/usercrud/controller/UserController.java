package com.cogoport.task.usercrud.controller;

import com.cogoport.task.usercrud.model.User;
import com.cogoport.task.usercrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<List<User>> getByID(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(service.getByID(id));
    }

    @DeleteMapping("/deleteUser/{id}")
    public HttpStatus deleteUser(@PathVariable("id") Integer id) {
        service.deleteUser(id);
        return HttpStatus.ACCEPTED;
    }

    @PostMapping("/addUser")
    public HttpStatus deleteUser(@RequestBody User user) {
        service.addUser(user);
        return HttpStatus.ACCEPTED;
    }

    @PutMapping("/updateFirstName")
    public HttpStatus updateFirstName(@RequestParam("id") Integer id,
                                      @RequestParam("firstName") String firstName) {
        service.updateFirstName(id, firstName);
        return HttpStatus.ACCEPTED;
    }

    @PutMapping("/updateLastName")
    public HttpStatus updateLastName(@RequestParam("id") Integer id,
                                     @RequestParam("lastName") String lastName) {
        service.updateLastName(id, lastName);
        return HttpStatus.ACCEPTED;
    }

    @PutMapping("/updateEmailId")
    public HttpStatus updateEmailId(@RequestParam("id") Integer id,
                                    @RequestParam("emailId") String emailId) {
        service.updateEmailId(id, emailId);
        return HttpStatus.ACCEPTED;
    }

    @PutMapping("/updatePhone")
    public HttpStatus updatePhone(@RequestParam("id") Integer id,
                                  @RequestParam("phone") String phone) {
        service.updatePhone(id, phone);
        return HttpStatus.ACCEPTED;
    }

    @PutMapping("/updateUser")
    public HttpStatus updateUser(@RequestBody User data) {
        service.updateUser(data);
        return HttpStatus.ACCEPTED;
    }
}
