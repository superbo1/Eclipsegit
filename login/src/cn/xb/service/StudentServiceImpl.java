package cn.xb.service;

import cn.xb.dao.StudentDao;
import cn.xb.dao.StudentDaoImpl;
import cn.xb.entity.User;

public class StudentServiceImpl implements StudentService{
	StudentDao studentDao = new StudentDaoImpl();
	@Override
	public int selectUserCount(User user) {
		return studentDao.selectUserCount(user);
	}
	@Override
	public boolean addUser(User user) {
		return studentDao.addUser(user);
	}

}
