package com.zhk.provider.controller;


import com.zhk.provider.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("queryById/{id}")
    @ResponseBody
    public String queryById(@PathVariable("id") Integer id){

        return personService.query(id).toString();
    }
}
