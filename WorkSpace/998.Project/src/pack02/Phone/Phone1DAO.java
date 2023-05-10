package pack02.Phone;

import java.util.Scanner;

public class Phone1DAO {

	Scanner sc = new Scanner(System.in);

	public void powerOn(Phone1DTO dto) {
		System.out.println(dto.getModel() + " 전원이 켜졌습니다.");
		dto.setState("켜짐");
	}

	public void powerOff(Phone1DTO dto) {
		System.out.println(dto.getModel() + " 전원이 꺼졌습니다.");
		dto.setState("꺼짐");
	}

	public int inputInt() {
		while (true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}

	public String call(Phone1DTO dto) { // 전화 받기
		dto.setCallState("대기중");
		System.out.println("전화가 와서 전화를 받았습니다.");
		dto.setCallState("전화중");
		System.out.println("나 : " + sc.nextLine());
		System.out.println("상대방: " + sc.nextLine());
		return dto.getCallState();
	}

	public String refuseCall(Phone1DTO dto) { // 전화 거절
		System.out.println("전화를 거절하셨습니다.");
		System.out.println("통화중인 상태가 아닙니다. 음성 전송 & 수신이 불가합니다.");
		dto.setCallState("대기중");
		return dto.getCallState();
	}

	public String hangUp(Phone1DTO dto) { // 전화 끊기
		System.out.println("전화를 끊습니다.");
		dto.setCallState("대기중");
		return dto.getCallState();
	}
}