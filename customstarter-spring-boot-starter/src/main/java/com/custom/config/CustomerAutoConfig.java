package com.custom.config;

import com.custom.properties.CustomerProperties;
import com.custom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 作者：qiwj
 * 时间：2020/6/12
 */
@Configuration
@EnableConfigurationProperties(CustomerProperties.class)
@ConditionalOnProperty(
        prefix = "custom",////存在配置前缀custom
        value = "enable",//开启
        matchIfMissing = true//缺失检查
)
public class CustomerAutoConfig {
    @Autowired
    private CustomerProperties customerProperties;

    @Bean
    //缺失CustomerService实体bean时，初始化CustomerService并添加到SpringIoc
    @ConditionalOnMissingBean(CustomerService.class)
    public CustomerService getCustomerService()
    {
        CustomerService customerService=new CustomerService();
        customerService.setName(customerProperties.getName());
        customerService.setUrl(customerProperties.getUrl());
        return customerService;
    }
}
