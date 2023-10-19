package cn.sqlhero.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：sqlhero.
 * @date ：Created in 2023/10/19 下午1:54
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Value("${demo.username}")
    private String username;

    @Value("${demo.password}")
    private String password;

    @GetMapping("/get")
    public Map<String,String> getDemoInfo(){
        Map<String,String> demoInfo = new HashMap<String, String>();
        demoInfo.put("username",username);
        demoInfo.put("password",password);
        return demoInfo;
    }
}
