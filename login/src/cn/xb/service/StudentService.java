package cn.xb.service;

import cn.xb.entity.User;

public interface StudentService {
	int selectUserCount(User user);
	
	boolean addUser(User user);
}
