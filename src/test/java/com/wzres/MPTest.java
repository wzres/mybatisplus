package com.wzres;

import com.wzres.domain.User;
import com.wzres.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName MPTest
 * @date 2023-09-01 19:31
 */

@SpringBootTest
public class MPTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        String[] hobby = {"抽烟", "喝酒", "烫头"};
        User user = new User(null, "王老五", "123456", hobby);
        userMapper.insert(user);
    }
}
