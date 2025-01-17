package top.atluofu.middleware.whitelist.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.middleware.whitelist.annotation.DoWhiteList;

/**
 * @ClassName: UserController
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2025Year-01Month-17Day-11:48
 * @Version: 1.0
 */
@Slf4j
@RestController
public class UserController {

    @DoWhiteList(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        log.info("查询用户信息，userId：{}", userId);
        return new UserInfo("虫虫:" + userId, 19, "天津市东丽区万科赏溪苑14-0000");
    }

}
