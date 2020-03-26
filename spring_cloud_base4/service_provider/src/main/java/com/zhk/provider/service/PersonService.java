package com.zhk.provider.service;


import com.zhk.provider.mapper.PersonMapper;
import com.zhk.provider.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person query(Integer id){
        return personMapper.selectByPrimaryKey(id);
    }


}
