package com.ling.springboot02.service;

import com.ling.springboot02.dao.bean.Person;

import java.util.List;


public interface PersonService {
    public List<Person> getAll();
}
