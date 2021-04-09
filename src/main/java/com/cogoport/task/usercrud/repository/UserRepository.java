package com.cogoport.task.usercrud.repository;

import com.cogoport.task.usercrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query(value = "update User u set u.FIRST_NAME = :firstName where u.id = :id", nativeQuery = true)
    void updateFirstName(int id, String firstName);

    @Modifying
    @Transactional
    @Query(value = "update User u set u.LAST_NAME = :lastName where u.id = :id", nativeQuery = true)
    void updateLastName(int id, String lastName);

    @Modifying
    @Transactional
    @Query(value = "update User u set u.EMAIL_ID = :emailId where u.id = :id", nativeQuery = true)
    void updateEmailId(int id, String emailId);

    @Modifying
    @Transactional
    @Query(value = "update User u set u.PHONE = :phone where u.id = :id", nativeQuery = true)
    void updatePhone(int id, String phone);
}
