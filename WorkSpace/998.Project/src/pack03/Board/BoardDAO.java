package pack03.Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class BoardDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	Scanner sc = new Scanner(System.in);

	public int inputint() { // 메뉴 선택
		while (true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}

	public Connection getConn() { // DB 연결
		String url = ("jdbc:oracle:thin:@211.223.59.99:1521:xe");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류 발생! 개발자에게 문의하세요.");
			e.printStackTrace();
		}
		return conn;
	}

	public void dbClose() { // DB 닫기
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean isSignIn(BoardDTO dto) { // 로그인
		try {
			conn = getConn();
			System.out.println("========== 로그인 ==========");
			ps = conn.prepareStatement("SELECT MEMBER_NAME FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ?");
			System.out.print("ID: ");
			ps.setString(1, sc.nextLine());
			System.out.print("PW: ");
			ps.setString(2, sc.nextLine());
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("MEMBER_NAME") + "님, " + "로그인에 성공하셨습니다. ");
				dto.setLoginState("로그인");
				return true;
			} else {
				System.out.println("로그인에 실패하셨습니다.");
			}
		} catch (Exception e) {
			System.out.println("로그인에 실패하셨습니다.");
		} finally {
			dbClose();
		}
		dto.setLoginState("로그아웃");
		return false;
	}

	public void signUp() { // 회원가입
		System.out.println("========== 회원가입 ==========");
		try {
			conn = getConn();
			ps = conn
					.prepareStatement("INSERT INTO MEMBER (MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_CALL, MEMBER_AGE) "
							+ "VALUES(?, ?, ?, ?, ?)");
			System.out.print("ID(20자 이내): ");
			ps.setString(1, sc.nextLine());
			System.out.print("PW(20자 이내): ");
			ps.setString(2, sc.nextLine());
			System.out.print("이름: ");
			ps.setString(3, sc.nextLine());
			System.out.print("전화번호: ");
			ps.setString(4, sc.nextLine());
			System.out.print("나이: ");
			ps.setInt(5, Integer.parseInt(sc.nextLine()));
			ps.executeUpdate();
			System.out.println("회원가입이 정상적으로 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	public void updateMemInfo() { // 회원정보수정
		System.out.println("========== 회원정보수정 ==========");
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM MEMBER");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("ID: " + rs.getString("MEMBER_ID") + "\t");
				System.out.print("PW: " + rs.getString("MEMBER_PW") + "\t");
				System.out.print("이름: " + rs.getString("MEMBER_NAME") + "\t");
				System.out.print("전화번호: " + rs.getString("MEMBER_CALL") + "\t");
				System.out.println("나이: " + rs.getInt("MEMBER_AGE"));
			}
			ps = conn.prepareStatement(
					"UPDATE MEMBER SET MEMBER_ID = ?, MEMBER_PW = ?, MEMBER_NAME = ?, MEMBER_CALL = ?, MEMBER_AGE = ? WHERE MEMBER_ID = ?");
			System.out.println("정보를 수정할 회원의 아이디를 입력해주세요.");
			ps.setString(6, sc.nextLine());
			System.out.println("정보를 수정해주세요.");
			System.out.print("ID: ");
			ps.setString(1, sc.nextLine());
			System.out.print("PW: ");
			ps.setString(2, sc.nextLine());
			System.out.print("이름: ");
			ps.setString(3, sc.nextLine());
			System.out.print("전화번호: ");
			ps.setString(4, sc.nextLine());
			System.out.print("나이: ");
			ps.setInt(5, Integer.parseInt(sc.nextLine()));
			ps.executeUpdate();
			System.out.println("정보수정이 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	public void deleteMember() { // 회원탈퇴
		try {
			conn = getConn();
			System.out.println("========== 회원탈퇴 ==========");
			ps = conn.prepareStatement("DELETE FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ?");
			System.out.println("탈퇴하시려는 계정의 ID와 PW를 입력해주세요.");
			System.out.print("ID: ");
			ps.setString(1, sc.nextLine());
			System.out.print("PW: ");
			ps.setString(2, sc.nextLine());
			ps.executeUpdate();
			System.out.println("회원 탈퇴가 정상적으로 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}

	}

	// ============================ 게시판 ============================

	public void boardMenu() { // 게시판 메뉴
		System.out.println("========== MENU ==========");
		System.out.print("1. 게시글 조회 ");
		System.out.print("2. 게시글 추가 ");
		System.out.print("3. 게시글 수정 ");
		System.out.print("4. 게시글 삭제 ");
		System.out.println("0. 종료");
	}

	public void selectList() { // 게시글 조회
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM BOARD2 WHERE TITLE = ?");
			System.out.println("조회하려는 게시글의 제목을 입력해주세요.");
			ps.setString(1, sc.nextLine());
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.print(rs.getInt("text_number") + ". ");
				System.out.print("제목: " + rs.getString("title") + "\t");
				System.out.print("내용: " + rs.getString("contents") + "\t");
				System.out.print("작성자(ID): " + rs.getString("member_id") + "\t");
				System.out.println("작성일: " + rs.getString("write_date"));
			} else {
				System.out.println("게시글을 찾을 수 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	public void insertBoard() { // 게시글 추가
		try {
			conn = getConn();
			ps = conn.prepareStatement(
					"INSERT INTO BOARD2 (TEXT_NUMBER, TITLE, CONTENTS, MEMBER_ID, WRITE_DATE) SELECT (MAX(TEXT_NUMBER))+1, ?, ?, ?, SYSDATE FROM BOARD2");
			System.out.println("각 항목을 차례대로 입력해주세요.");
			System.out.print("제목: ");
			ps.setString(1, sc.nextLine());
			System.out.print("내용: ");
			ps.setString(2, sc.nextLine());
			System.out.print("작성자(ID): ");
			ps.setString(3, sc.nextLine());
			ps.executeUpdate();
			System.out.println("게시글이 정상적으로 등록되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	public void updateBoard() { // 게시글 수정
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM BOARD2 ORDER BY 1");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("text_number") + ". ");
				System.out.print("제목: " + rs.getString("title") + "\t");
				System.out.print("내용: " + rs.getString("contents") + "\t");
				System.out.print("작성자(ID): " + rs.getString("member_id") + "\t");
				System.out.println("작성일: " + rs.getString("write_date"));
			}
			ps = conn
					.prepareStatement("UPDATE BOARD2 SET TITLE = ?, CONTENTS = ?, MEMBER_ID = ? WHERE TEXT_NUMBER = ?");
			System.out.println("수정하려는 게시글의 번호를 입력해주세요.");
			ps.setInt(4, Integer.parseInt(sc.nextLine()));
			System.out.println("수정할 항목을 차례대로 입력해주세요.");
			System.out.print("제목: ");
			ps.setString(1, sc.nextLine());
			System.out.print("내용: ");
			ps.setString(2, sc.nextLine());
			System.out.print("작성자(ID): ");
			ps.setString(3, sc.nextLine());
			ps.executeUpdate();
			System.out.println("게시글 수정이 정상적으로 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	public void deleteBoard() { // 게시글 삭제
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM BOARD2 ORDER BY 1");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("text_number") + ". ");
				System.out.print("제목: " + rs.getString("title") + "\t");
				System.out.print("내용: " + rs.getString("contents") + "\t");
				System.out.print("작성자(ID): " + rs.getString("member_id") + "\t");
				System.out.println("작성일: " + rs.getString("write_date"));
			}
			conn = getConn();
			ps = conn.prepareStatement("DELETE FROM BOARD2 WHERE TEXT_NUMBER = ?");
			System.out.println("삭제하려는 게시글의 번호를 입력해주세요.");
			ps.setInt(1, Integer.parseInt(sc.nextLine()));
			ps.executeUpdate();
			System.out.println("게시글 삭제가 정상적으로 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			dbClose();
		}
	}

	// ==========================================================================================================================================

	public void exit(BoardDTO dto) { // 로그아웃
		System.out.println("프로그램이 종료되었습니다.");
		dto.setLoginState("로그아웃");
	}
}