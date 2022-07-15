package com.bbva.cam.review.ServiceCAM.controller;

import com.bbva.cam.review.ServiceCAM.model.User;
import com.bbva.cam.review.ServiceCAM.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/management/api/v1/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable String id) {
        LOGGER.info(MessageFormatter.format("Id del Usuario a Consultar: {}", id).getMessage());
        return userService.getUser(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    User createUser(@RequestBody User objUser) {
        LOGGER.info(MessageFormatter.format("Valor del Usuario a Crear: {}", objUser).getMessage());
        return userService.createUser(objUser);
    }

    @PutMapping("/{id}")
    User updateUser(@PathVariable String id, @RequestBody User objUser) {
        LOGGER.info(MessageFormatter.format("Valor del Usuario a Actualizar: {}", objUser).getMessage());
        return userService.updateUser(id, objUser);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable String id) {
        LOGGER.info(MessageFormatter.format("Id del Usuario a Eliminar: {}", id).getMessage());
        userService.deleteUser(id);
    }

}
