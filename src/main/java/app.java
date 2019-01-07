import com.cuizhiwen.common.Config;
import com.cuizhiwen.common.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2019/1/7 10:00
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
    @ComponentScan(value = "com.cuizhiwen.common", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
public class app {
    /**
     * 1> @EnableAutoConfiguration 告诉容器去通过依赖的jar配置spring工程，
     *    例如:spring-boot-starter-web中包含的tomcat和springmvc，它会认为这是一个web项目并进行相应的配置。
     *
     * 2> @ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器，包括所有的配置类。
     *            1)创建一个配置类，在配置类上添加 @ComponentScan 注解。该注解默认会扫描该类所在的包下所有的配置类
     *            2）指定要扫描的包（使用@ComponentScan 的 valule 属性来配置）
     *            3）使用 excludeFilters 来按照规则排除某些包的扫描。
     *            4) @ComponentScan 的 useDefaultFilters 属性，该属性默认值为 true，spring 默认会自动发现被
     *               @Component、@Repository、@Service 和 @Controller 标注的类，并注册进容器中。
     *            5)添加多种扫描规则 ,可以添加多个 @ComponentScan 来添加多个扫描规则，但是在配置类中要加上 @Configuration 注解，否则无效。
     *
     */

    public static void main(String[] args) {

        SpringApplication.run(app.class, args);

        /**
         * 获取已经注册到容器中的 bean 的名称
         * @param args
         */
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("**********beanName************: " + beanName);
        }

    }

}
