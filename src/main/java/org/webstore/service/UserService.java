package org.webstore.service;

import org.webstore.entity.User;

/**
 * Created by lyf on 2016/10/28.
 */
public interface UserService {
    public boolean addOneUser(User user);
    public String login(User user);
    public boolean cookieLogin(User user,String ip);
    public void writeCommonIp(User user,String ip);
    public User queryUser(User user);
}
