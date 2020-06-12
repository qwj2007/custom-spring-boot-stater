package com.custom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * 作者：qiwj
 * 时间：2020/6/12
 */

@ConfigurationProperties(prefix = "custom")
public class CustomerProperties {

    private String name="";

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

    private String url="";
}
