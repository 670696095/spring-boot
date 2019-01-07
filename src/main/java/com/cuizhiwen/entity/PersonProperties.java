package com.cuizhiwen.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2019/1/7 13:46
 */
@Component
@PropertySource({"classpath:application.yml"})
@ConfigurationProperties(prefix = "person")
public class PersonProperties {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
