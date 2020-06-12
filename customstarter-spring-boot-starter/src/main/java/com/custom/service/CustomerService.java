package com.custom.service;

/**
 * 作者：qiwj
 * 时间：2020/6/12
 */
public class CustomerService {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCustomer()
    {
        return "我们得到数据"+this.name+","+this.url;
    }
}
