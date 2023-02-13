package com.ling.springboot02.controller;

import com.ling.springboot02.dao.bean.Person;
import com.ling.springboot02.message.LinkedBlockQueue_message;
import com.ling.springboot02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private LinkedBlockQueue_message blockQueueMessage;


    @RequestMapping("/selectAll")
    public List<Person> PersonById(){
        int a = 1;
        return personService.getAll();
    }

//    @RequestMapping("/selectAll")
//    public List<Person> PersonById(@RequestParam("id") int id){
//        List l = new ArrayList();
//        id++;
//        l.add(id);
//        return l;
//    }

    /**
     * 测试阻塞队列的功能
     * @param message
     */
    @GetMapping("/cusLinkQueue")
    public void cusLinkQueue(@RequestParam String message) {
        blockQueueMessage.addMessage(message);
    }



}
