package top.atluofu.middleware.whitelist.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: WhiteListProperties
 * @description: 用于创建指定前缀(prefix = " atluofu.whitelist ")的自定义配置信息，这样就在 yml 或者 properties 中读取到我们自己设定的配置信息
 * @author: 有罗敷的马同学
 * @datetime: 2025Year-01Month-17Day-11:28
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "atluofu.whitelist")
@Data
public class WhiteListProperties {
    private String users;
}
