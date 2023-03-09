package com.keduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BestSellerDAO { // MYSQL과 드라이버 연결 해줘야함

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private static BestSellerDAO dao;
	private final String url = "jdbc:mysql://localhost:3306/keduit?serverTimezone=UTC";
	private final String user = "root";
	private final String pwd = "0000";

	private BestSellerDAO() { // 생성자
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("--------DriverManager--------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disConnection() {
		try {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static BestSellerDAO newInstance() {
		if (dao == null)
			dao = new BestSellerDAO();
		return dao;
	}

	public void BestSellerInsert(BestSellerVO vo) {
		try {
			// 1. DB연결
			getConnection();

			// 2. sql문을 작성
			String sql = "insert into bestseller values (null, ?, ?, ?, ?, ?)"; // (null, ?, ?, ?, ?, ?, ?)

			// 3. mysql로 sql문을 전달
			pstmt = conn.prepareStatement(sql);

			// prepareStatement에 vo에게 전달 받은 값을 할당
			pstmt.setString(1, vo.getBookName());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getPublisher());
			pstmt.setString(4, vo.getReleaseDate());
			pstmt.setString(5, vo.getPrice());
//			pstmt.setString(6, vo.getBookInfo());

			// 5.전송된 값을 테이블에 적용시킴. 업데이트
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
