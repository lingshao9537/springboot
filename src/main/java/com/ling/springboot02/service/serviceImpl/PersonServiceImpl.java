package com.ling.springboot02.service.serviceImpl;


import com.ling.springboot02.dao.bean.Person;
import com.ling.springboot02.dao.mapper.PersonMapper;
import com.ling.springboot02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> getAll() {
        return personMapper.getAll();
    }
}
