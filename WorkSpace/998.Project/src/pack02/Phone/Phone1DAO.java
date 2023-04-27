package pack02.Phone;


import java.util.Scanner;

public class Phone1DAO {
	String turnOn(Phone1DTO dto) {
		if(dto.getState().equals("켜짐")) {			
			System.out.println("전원이 켜졌습니다.");
		}
		return dto.getState();
	}

	String turnOff(Phone1DTO dto) {
		if(dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼졌습니다.");			
		}
		return dto.getState();
	}

	boolean call(Phone1DTO dto) {
		Scanner sc = new Scanner(System.in);
		if (dto.getState().equals("켜짐")) {
			System.out.println("전화가 와서 전화를 받았습니다.");
			System.out.println("나: " + sc.nextLine());
			System.out.println("상대방: " + sc.nextLine());
			System.out.println("전화를 끊습니다.");
			System.out.println("통화중인 상태가 아닙니다. 음성 전송 & 수신이 불가합니다.");
			return true;
		} else {
			System.out.println("전원이 꺼져있어 전화 받기가 불가합니다.");
			System.out.println("전원이 꺼져있어 전화 끊기가 불가합니다.");
		}
		return false;
	}

}
