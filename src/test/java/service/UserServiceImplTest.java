package service;

import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author yangxin
 * @time 2018/12/29  13:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/springDao-config.xml",
                        "classpath:spring/springService-config.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void Test(){
        User user=new User("fuck","55666");
        System.out.println(":"+userService.login(user));
    }


}