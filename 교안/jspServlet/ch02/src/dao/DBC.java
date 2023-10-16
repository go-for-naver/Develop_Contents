package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DBC (Database Connection) 인터페이스는 데이터베이스 연결 및 연결 해제를 처리하는 메서드를 정의하는데 사용.
public interface DBC {

    // 데이터베이스에 연결하는 메서드
    public Connection connect();

    // PreparedStatement 및 Connection을 닫는 메서드를 정의.
    // 이 메서드는 PreparedStatement와 Connection 객체를 전달받아 연결을 닫는다.
    public void close(PreparedStatement pstmt, Connection conn);

    // ResultSet, PreparedStatement, 및 Connection을 닫는 메서드를 정의.
    // 이 메서드는 ResultSet, PreparedStatement 및 Connection 객체를 전달받아 연결을 닫는다.
    public void close(ResultSet rs, PreparedStatement pstmt, Connection conn);
}
