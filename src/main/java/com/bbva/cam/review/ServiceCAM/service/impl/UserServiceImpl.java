package com.bbva.cam.review.ServiceCAM.service.impl;

import com.bbva.cam.review.ServiceCAM.model.User;
import com.bbva.cam.review.ServiceCAM.repository.UserRepository;
import com.bbva.cam.review.ServiceCAM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRepository
                .findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public User createUser(User objUser) {
        return userRepository.save(objUser);
    }

    @Override
    public User updateUser(String id, User objUser) {
        User userFromBD = userRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);

        userFromBD.setNombre(objUser.getNombre());
        userFromBD.setApPaterno(objUser.getApPaterno());
        userFromBD.setApMaterno(objUser.getApMaterno());
        userFromBD.setEmail(objUser.getEmail());
        userFromBD.setEquipo(objUser.getEquipo());
        userFromBD.setActivo(objUser.isActivo());

        return userRepository.save(userFromBD);
    }

    @Override
    public void deleteUser(String id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);

        userRepository.delete(user);
    }

}
