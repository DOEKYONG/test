package 평가;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {

	
	private static Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private  static PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private static ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static UserDao userDao = new UserDao(); // DB 연동 객체;
	
	
	
	
	public static void main(String[] args) {
		try {
			// DB연동 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB 주소 연결 
			System.out.println("연동성공");
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
	
	}


//