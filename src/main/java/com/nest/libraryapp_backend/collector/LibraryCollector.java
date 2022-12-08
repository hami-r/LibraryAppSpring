package com.nest.libraryapp_backend.collector;

import com.nest.libraryapp_backend.dao.BookDao;
import com.nest.libraryapp_backend.dao.UserDao;
import com.nest.libraryapp_backend.model.Book;
import com.nest.libraryapp_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class LibraryCollector {

    @Autowired
    private UserDao userdao;

    @Autowired
    private BookDao bookdao;

    @PostMapping("/")
    public String homepage() {
        return "Welcome to my website";
    }

    @PostMapping("/admin")
    public String adminLoginPage() {
        return "Welcome to admin login page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
    public List<User> userLoginPage(@RequestBody User user) {
        return (List<User>)userdao.verify(user.getUsername(),user.getPassword());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userreg",consumes = "application/json",produces = "application/json")
    public HashMap<String ,String > userRegisterPage(@RequestBody User user) {
        userdao.save(user);
        HashMap<String ,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> addPage(@RequestBody Book book) {
        bookdao.save(book);
        HashMap<String ,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/issue",consumes = "application/json",produces = "application/json")
    public String issuePage() {
        return "Welcome to book issue page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Book> searchPage(@RequestBody Book book) {
        return (List<Book>) bookdao.searchBook(book.getBookTitle());
    }

    @PostMapping("/edit")
    public String editPage() {
        return "Welcome to book edit page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> deletePage(@RequestBody Book book) {
        bookdao.delete(book);
        HashMap<String ,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @GetMapping("/view")
    public List<Book> viewPage() {
        return (List<Book>) bookdao.findAll();
    }
}
