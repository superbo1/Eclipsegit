package cn.xb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.xb.entity.User;
//测试IDEA 上传到远程服务器
public class StudentDaoImpl implements StudentDao{
	private static final String url="jdbc:mysql://localhost:3306/smproject";
	private static final String user1="root";
	private static final String password="123456";
	int count = -1;
	@Override
	public int selectUserCount(User user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user1, password);
			String sql = "SELECT COUNT(*) FROM USER WHERE NAME = ? AND pwd = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPwd());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	@Override
	public boolean addUser(User user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user1, password);
			String sql = "insert into user values(null,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPwd());
			int result = pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}

}
