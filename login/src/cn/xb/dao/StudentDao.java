package cn.xb.dao;

import cn.xb.entity.User;
//µÂÂêÎ÷ÑÇ
public interface StudentDao {
	int selectUserCount(User user);
	
	boolean addUser(User user);
}
