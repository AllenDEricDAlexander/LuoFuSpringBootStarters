package top.atluofu.middleware.whitelist.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: UserInfo
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2025Year-01Month-17Day-11:44
 * @Version: 1.0
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserInfo {
    private String code;
    private String info;

    private String name;
    private Integer age;
    private String address;

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public UserInfo(String name, Integer age, String address) {
        this.code = "0000";
        this.info = "success";
        this.name = name;
        this.age = age;
        this.address = address;
    }



}
