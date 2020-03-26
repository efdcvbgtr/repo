package com.zhk.consumer.client;


import org.springframework.stereotype.Component;

@Component
public class PersonClientFB implements PersonClient {
    @Override
    public String queryById(Integer id) {
        return "error!!";
    }
}
