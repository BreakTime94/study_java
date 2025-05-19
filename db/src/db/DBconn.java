//package db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class DBconn {
//	// 
//	public static void main(String[] args) throws Exception {
//		//1.접속객체 취득
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "sample", "1234");
//		//에러메세지가 안 나오면 접속 성공!
//		System.out.println(conn);
//		//2. 문장 생성
//		Statement stmt = conn.createStatement();
//		//3. 문장 실행후 결과 반환
//		ResultSet rs = stmt.executeQuery("select * from student");
//		//4. 결과 순회 후, 파싱
//		while(rs.next()) { // next 커서 이동 이동할 커서가 있으면 true가 나오고 할 게 없으면 터져버림
//			System.out.println(rs.getInt("studno") + " :: " + rs.getString("name"));
//		}
//	}
//}
