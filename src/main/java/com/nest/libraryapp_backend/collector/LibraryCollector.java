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

    @PostMapping("/add")
    public String addPage() {
        return "Welcome to book add page";
    }

    @PostMapping("/issue")
    public String issuePage() {
        return "Welcome to book issue page";
    }
    @PostMapping("/search")
    public String searchPage() {
        return "Welcome to book search page";
    }

    @PostMapping("/edit")
    public String editPage() {
        return "Welcome to book edit page";
    }

    @PostMapping("/delete")
    public String deletePage() {
        return "Welcome to book delete page";
    }
}
