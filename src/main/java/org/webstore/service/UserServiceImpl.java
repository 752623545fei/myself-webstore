package org.webstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webstore.dao.UserDao;
import org.webstore.entity.User;

/**
 * Created by lyf on 2016/10/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean addOneUser(User user) {
        String haveName = userDao.queryByName(user.getName());
        System.out.println(haveName);
        if (haveName==null && !"".equals(haveName)){
            int result = userDao.addUser(user);
            if (result == 0){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }


    @Override
    public String login(User user) {
        System.out.println(user.getName());
        String userPassword = userDao.queryPassword(user.getName());
        if(userPassword == null){
            return "用户名不存在！";
        }else if (userPassword.equals(user.getPassword())) {
            System.out.println("loginservice=========success");
            return "登录成功！";
        }else {
            return "密码错误！";
        }
    }

    @Override
    public boolean cookieLogin(User user,String ip) {
        String userId = userDao.queryIdByName(user.getName());
        String commonIp = userDao.queryCommonIp(userId,ip);
        if (commonIp == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public User queryUser(User user) {
        User user1 = userDao.queryOne(user.getName());
        return user1;
    }

    @Override
    public void writeCommonIp(User user, String ip) {
        String userId = userDao.queryIdByName(user.getName());
        String commonIp = userDao.queryCommonIp(userId,ip);
        if (commonIp == null ){
            System.out.println(userId+"==="+ip);
            userDao.addCommonIp(userId,ip);
        }
    }

}
