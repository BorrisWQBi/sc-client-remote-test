package com.borris.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/remote")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/testRemote")
    public String testRemote(){
        String url = "http://test-client/borris/test/method1";
        String s = restTemplate.getForObject(url,String.class);
        return s;
    }

    @RequestMapping("/remoteGetUserList")
    public String remoteGetUserList(){
        String url = "http://test-client/borris/test/getUserList";
        String userList = restTemplate.getForObject(url,String.class);
        return userList;
    }
}
