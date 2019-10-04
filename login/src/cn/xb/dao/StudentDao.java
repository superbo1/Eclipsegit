package cn.xb.dao;
//double
import cn.xb.entity.User;

public interface StudentDao {
	int selectUserCount(User user);
	boolean addUser(User user);
}
