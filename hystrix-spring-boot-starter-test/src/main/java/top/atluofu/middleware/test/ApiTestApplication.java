package top.atluofu.middleware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: LuoFuSpringBootStarters
 * @BelongsPackage: top.atluofu.middleware.test
 * @ClassName: ApiTestApplication
 * @Author: atluofu
 * @CreateTime: 2025Year-06Month-17Day-11:19
 * @Description: 测试工程
 * @Version: 1.0
 */
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"cn.bugstack.middleware"})
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
