package zzz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {
	public static void main(String[] args) {
		// JDBC : Java DataBaseConnectivity API
		// Connection : ���� ��ü
		// Statement : ���� ��ü
		// ResultSet : ��� ��ü
		// OracleDriver : �ش� Ŭ���� �ʿ�(����Ŭ ���� ����)
		Jdbc jdbc = new Jdbc();
		jdbc.connTest();
	}
	
	// �ڹ� �ڵ带 ���� �����ͺ��̽��� ������ �������� Ȯ���ϴ� �޼ҵ�
	public void connTest() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // �ڹٿ��� ����Ŭ ���� �� �� �տ� ������ ��
		String user = "hr";
		String password = "0000";
		
		// Ŭ���� �����ε�(Ŭ������ �ν��Ͻ�ȭ �ϴ°� �ƴ϶� �ڹ� static���� �ڹٿ��� ����� �� �ְ� ����)
		// ����Ŭ ������ ���� ����(����Ŭ�� �̷��� �϶�� ��Ŵ)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver�� ���ٸ� ���� �߻�, ������ ���� �ڵ� ����
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = conn.prepareStatement("select 100 data1 from dual"); // ;����, ������ ������ �ʱ�ȭ
			ResultSet rs = ps.executeQuery(); // ���� ����, ���� �� ��� rs�� ����
			// rs�� �ε��� ����
			while(rs.next()) {
				System.out.println(rs.getInt("data1"));
			}
			if (conn.isClosed()) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // �� .java ������ jdbc.jar�� ��� ���� �߻�
}