package com.customerstarter.testcustomerstarterspringbootstater;

import com.custom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：qiwj
 * 时间：2020/6/12
 */
@RestController
public class testController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/")
    public String getInfo()
    {
        //customerService.setUrl("www.bing.com");
       // customerService.setName("sdfd");
      return   customerService.getCustomer();
    }
}
