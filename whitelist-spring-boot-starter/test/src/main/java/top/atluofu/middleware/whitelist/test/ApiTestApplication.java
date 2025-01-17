package top.atluofu.middleware.whitelist.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: ApiTestApplication
 * @description: test work
 * @author: 有罗敷的马同学
 * @datetime: 2025Year-01Month-17Day-11:43
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.atluofu.middleware.*"})
public class ApiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
