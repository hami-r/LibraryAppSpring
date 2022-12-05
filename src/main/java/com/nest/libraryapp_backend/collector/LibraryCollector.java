package com.nest.libraryapp_backend.collector;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryCollector {

    @PostMapping("/")
    public String homepage() {
        return "Welcome to my website";
    }

    @PostMapping("/admin")
    public String adminLoginPage() {
        return "Welcome to admin login page";
    }

    @PostMapping("/userlogin")
    public String userLoginPage() {
        return "Welcome to user login page";
    }

    @PostMapping("/userreg")
    public String userRegisterPage() {
        return "Welcome to user register page";
    }

    @PostMapping("/admin")
    public String addPage() {
        return "Welcome to book add page";
    }
}
