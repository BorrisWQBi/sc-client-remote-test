package com.borris.sc.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("test-client")
public interface TestRemoteService {

    @RequestMapping("/borris/test/getUserList")
    String getUserList();
}
