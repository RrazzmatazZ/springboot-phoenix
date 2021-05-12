package com.dreamtail.springboot.phoenix;

import com.dreamtail.springboot.phoenix.dao.UserDao;
import com.dreamtail.springboot.phoenix.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HbasePhoenixApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void context() {
        System.out.println("success!");
    }

    @Test
    public void testDAO() {
        for (User user : userDao.listAll()) {
            System.out.println(user);
        }
    }
}
