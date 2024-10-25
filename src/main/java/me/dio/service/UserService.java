package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    User findyById(long id);


    User create (User userToCreate);
}
