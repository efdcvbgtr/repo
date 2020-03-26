package com.zhk.consumer.controller;


import com.zhk.consumer.client.PersonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private PersonClient personClient;

    @RequestMapping("query")
    @ResponseBody
    public String queryById(@RequestParam("id") Integer id){
        return personClient.queryById(id);
    }
}
