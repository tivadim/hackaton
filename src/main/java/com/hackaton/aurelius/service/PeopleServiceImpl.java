package com.hackaton.aurelius.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public List<String> getEmails() {
        return new ArrayList<>(Arrays.asList("test1@example.com", "test2@example.com"));
    }
}
