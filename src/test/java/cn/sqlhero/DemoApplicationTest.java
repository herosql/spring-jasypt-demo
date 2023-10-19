package cn.sqlhero;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DemoApplicationTest {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Value("${demo.username}")
    private String username;

    @Value("${demo.password}")
    private String password;


    @Test
    public void test() {
        String username = "demo";
        String password = "vsfsgtw";
        assertEquals(username,this.username);
        assertEquals(password,this.password);
    }


}