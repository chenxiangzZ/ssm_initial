package dao;

import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author yangxin
 * @time 2018/12/29  13:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/springDao-config.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void Test(){
        User user=new User("wang","123456");
        System.out.println(":"+userDao.insertUser(user));
    }


}