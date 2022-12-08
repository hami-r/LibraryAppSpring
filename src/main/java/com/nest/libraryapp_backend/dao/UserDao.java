package com.nest.libraryapp_backend.dao;

import com.nest.libraryapp_backend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User,Integer> {

    @Query(value = "SELECT `id`,`address`,`adhar_no`,`dob`,`email`,`name`,`password`,`phone_no`,`pincode`,`username` FROM `users` WHERE `username`=:username AND `password` = :password",nativeQuery = true)
    List<User> verify(String username,String password);
}
