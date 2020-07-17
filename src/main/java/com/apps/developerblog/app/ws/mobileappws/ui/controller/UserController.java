package com.apps.developerblog.app.ws.mobileappws.ui.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") //htpp://localhost:8080/users

public class UserController {
    public String getUser()
    {
        return "get user was called";
    }

}
