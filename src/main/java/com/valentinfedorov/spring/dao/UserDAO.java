package com.valentinfedorov.spring.dao;

import com.valentinfedorov.spring.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
}
