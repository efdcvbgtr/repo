package com.zhk.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "service-provider",fallback = PersonClientFB.class)
public interface PersonClient {

    @RequestMapping("person/queryById/{id}")
    public String queryById(@PathVariable("id") Integer id);

}
