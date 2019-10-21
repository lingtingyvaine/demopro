package com.itheima.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAll() {
		Connection coon = null;
		Statement statement = null;
		ResultSet re = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//注册驱动
			//建立连接
			coon = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "acxoa");
			statement = coon.createStatement();
			re = statement.executeQuery("select * from t_stu");
			while(re.next()){
				System.out.println(re.getString("name"));
			}
		
	}catch(Exception e){
		
	}
	}

}
