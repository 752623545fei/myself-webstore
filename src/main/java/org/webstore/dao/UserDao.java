package org.webstore.dao;

import org.apache.ibatis.annotations.Param;
import org.webstore.entity.User;

public interface UserDao {

	int addUser(User user);
	User queryOne(String name);
	String queryByName(String name);
	String queryPassword(@Param("name")String name);
	String queryIdByName(@Param("name") String name);
	String queryCommonIp(@Param("userId")String id,@Param("ip")String ip);
	int addCommonIp(@Param("userId")String id,@Param("ip")String ip);
}
