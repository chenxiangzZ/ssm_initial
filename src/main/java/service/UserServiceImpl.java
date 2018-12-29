package service;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangxin
 * @time 2018/12/29  13:28
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    public int login(User user){
        return userDao.insertUser(user);
    }

}
