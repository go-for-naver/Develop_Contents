package dao;
import java.sql.*;
public class MariaDBCon implements DBC {
    final String DRIVER = "org.mariadb.jdbc.Driver"; // 데이터 베이스 주소명
    final String DNS = "localhost"; // 로컬에서 사용
    final String PORT = "3306"; // 기본 포트
    final String NAME = "edu"; // DB명 이름은 알아서
    final String USER = "root"; // DB 로그인 계정
    final String PASS = "1234"; // 비번
    final String URL = "jdbc:mariadb://"+DNS+":"+PORT+"/"+NAME; // 접속 시 루트 정보
    Connection conn = null;
    @Override
    public Connection connect() { // 데이터베이스 연결을 수행하는 메서드
        try {
            Class.forName(DRIVER); // JDBC 드라이버 클래스를 로드.
            try {
                conn = DriverManager.getConnection(URL, USER, PASS); // DriverManager 클래스를 사용하여 데이터베이스에 연결.
            } catch (SQLException e) {
                throw new RuntimeException(e); // 데이터베이스 연결 중에 오류가 발생하면 RuntimeException을 던짐 - 덤핑이라고 함
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);  // 드라이버 클래스 로드 중에 오류가 발생하면 RuntimeException을 던짐 - 똑같이 덤핑.
        }
        return conn;  // 연결된 Connection 객체를 반환
    }

    @Override
    public void close(PreparedStatement pstmt, Connection conn) {   // PreparedStatement와 Connection을 닫는 메서드
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);   // 예외 발생 시 RuntimeException을 던짐 - 덤핑
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);   // 예외 발생 시 RuntimeException을 던짐 - 덤핑
            }
        }
    }

    @Override
    public void close(ResultSet rs, PreparedStatement pstmt, Connection conn) { // ResultSet, PreparedStatement, 그리고 Connection을 닫는 메서드
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);  // 예외 발생 시 RuntimeException을 던짐 - 덤핑
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e); // 예외 발생 시 RuntimeException을 던짐 - 덤핑
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e); // // 예외 발생 시 RuntimeException을 던짐 - 덤핑
            }
        }
    }
}
