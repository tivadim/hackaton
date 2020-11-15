package com.hackaton.aurelius.controller;

import com.hackaton.aurelius.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @Autowired
    private PeopleService peopleService;

    @GetMapping("/welcome")
    public List<String> welcome() {
        return peopleService.getEmails();
    }
}
