package ��;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {

	
	private static Connection con; // DB������ ���Ǵ� Ŭ���� : DB����Ŭ����
	private  static PreparedStatement ps; // ����� DB�� SQL ���� �Ҷ� ���Ǵ� �������̽� : DB�����������̽�
	private static ResultSet rs; // ������� �����ϴ� �������̽� 
	
	public static UserDao userDao = new UserDao(); // DB ���� ��ü;
	
	
	
	
	public static void main(String[] args) {
		try {
			// DB���� 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB �ּ� ���� 
			System.out.println("��������");
		}
		catch(Exception e ) { System.out.println( "[DB ���� ����]"+e  ); }
	}
	
	}


//