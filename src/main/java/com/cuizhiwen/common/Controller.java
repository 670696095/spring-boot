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
     * 1>GroupID 是项目组织唯一的标识符，实际对应JAVA的包的结构，是main目录里java的目录结构。
     *
     * 2>ArtifactID是项目的唯一的标识符，实际对应项目的名称，就是项目根目录的名称。
     *
     * 1> @@RestController 无法返回jsp或html中配置的视图解析器，返回json，xml或自定义内容。
     * 2> @Controller 可解析return的jsp，html并跳到响应的页面。
     * 3>
     */
}
