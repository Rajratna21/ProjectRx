package com.diagnisticcenter.dto;
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(int userId) {
        super("User with id " + userId + " not found");
    }
}