package com.cuizhiwen.common;

import com.cuizhiwen.entity.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2019/1/7 13:43
 */
public class GetValue {
    /**
     * 方式一：
     */
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;

    /**
     * 方式二:
     *       通过@Autowired配合@ConfigurationProperties(prefix = "person")取值
     */
    @Autowired
    private PersonProperties personProperties;
    private String nameP = personProperties.getName();
    private int ageP = personProperties.getAge();

    /**
     *方式三:
     */
    @Autowired
    private Environment env;

    public void speak() {
        System.out.println("=========>" + env.getProperty("aaa"));

    }


}
