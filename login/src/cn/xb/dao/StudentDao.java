package cn.xb.dao;

import cn.xb.entity.User;

public interface StudentDao {
	int selectUserCount(User user);
	
	boolean addUser(User user);
}
