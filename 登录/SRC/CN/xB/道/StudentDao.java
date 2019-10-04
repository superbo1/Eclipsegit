package cn.xb.dao;

import cn.xb.entity.User;
//µÂÂêÎ÷ÑÇ
//hello word
//你好世界
//test
public interface StudentDao {
	int selectUserCount(User user);
	
	boolean addUser(User user);
}
