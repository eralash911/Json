package com.domain.Json.controller;

import com.domain.Json.entityes.Person;
import com.domain.Json.repositories.PersonRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@RestController
public class Controller {

    private final static Logger logger = LoggerFactory.getLogger(Controller.class);
    private PersonRepo personRepo;
    @Autowired
    public Controller(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @RequestMapping("postgres")
    public void json()  {
        URL resourse = this.getClass().getClassLoader().getResource("people.json");

        if(resourse != null){

             ObjectMapper objectMapper = new ObjectMapper();
            try {
                List <Person> people = objectMapper.readValue(resourse, new TypeReference<List<Person>>()  {  } );

                personRepo.saveAll(people);
                logger.info("all record saved");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            logger.warn("url is null");
        }
    }
}
