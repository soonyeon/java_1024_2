package example.db.main;

import java.io.InputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.day4.dao.StudentDAO;



public class Main {
	public static void main(String[] args) {
		String resource = "db/day/main/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			try (SqlSession session = sqlSessionFactory.openSession()) {
				MainController mc = new MainController(session);
				mc.run();
			
				}
				
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		}


}
