package com.cuizhiwen.common;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2019/1/7 10:03
 */
@RestController
public class Controller {
    /**
     * 1> @RestController 无法返回jsp或html中配置的视图解析器，返回json，xml或自定义内容。
     * 2> @Controller 可解析return的jsp，html并跳到响应的页面。
     * 3> @Component  在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释，
     *                而用 @Component 对那些比较中立的类进行注释。
     */
}
