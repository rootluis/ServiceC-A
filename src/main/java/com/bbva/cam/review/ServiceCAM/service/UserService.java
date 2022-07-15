package com.bbva.cam.review.ServiceCAM.service;

import com.bbva.cam.review.ServiceCAM.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUser(String id);

    public User createUser(User objUser);

    public User updateUser(String id, User objUser);

    public void deleteUser(String id);
}
