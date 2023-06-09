package pack02.Phone;

public class Phone3Main {
	public static void main(String[] args) {
		Phone3DAO p3dao = new Phone3DAO();
		Phone3DTO p3dto = new Phone3DTO("검정", "이니셜-3", "꺼짐", "대기중");

		System.out.print("색상: " + p3dto.getColor() + ", ");
		System.out.print("모델명: " + p3dto.getModel() + ", ");
		System.out.print("상태: " + p3dto.getState() + ", ");
		System.out.println("채널: " + p3dto.getChannel());

		System.out.println();
		if (p3dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜시겠습니까?");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.powerOn(p3dto);
			} else {
				p3dao.powerOff(p3dto);
			}
		}

		if (p3dto.getState().equals("켜짐")) {
			System.out.println("전화를 받으시겠습니까? 받으실거면 1번을 누르세요.(거절은 2번입니다.)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.call(p3dto);
			} else if (inputMenu == 2) {
				p3dao.refuseCall(p3dto);
			}
		} else {
			System.out.println("전원이 꺼져있어 전화 받기가 불가합니다.");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.powerOn(p3dto);
			} else {
				p3dao.powerOff(p3dto);
			}
		}

		if (p3dto.getState().equals("꺼짐") && p3dto.getCallState().equals("대기중")) {
			System.out.println("전원이 꺼져있어 DMB를 켤 수 없습니다. 전원을 먼저 켜주세요.");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.powerOn(p3dto);
			} else {
				p3dao.powerOff(p3dto);
			}
		}

		if (p3dto.getState().equals("켜짐") && p3dto.getCallState().equals("대기중")) {
			System.out.println("DMB방송을 켜시겠습니까? 방송을 켜시려면 1을 눌러주세요. (그 외에는 종료)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.dmbOn(p3dto);
			} else {
				p3dao.dmbOff(p3dto);
			}
		} else if (p3dto.getState().equals("켜짐") && p3dto.getCallState().equals("전화중")) {
			System.out.println("통화 중인 상태에서는 DMB 방송을 켤 수 없습니다.");
			System.out.println("전화를 끊으실거면 1을 눌러주세요.");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.hangUp(p3dto);
				p3dao.dmbOn(p3dto);
			}
		}

		if (p3dto.getState().equals("켜짐") && p3dto.getDmbState().equals("시청중")) {
			p3dao.changeChannel(p3dto);
		} else {
			System.out.println("DMB가 켜져있지않아 채널 변경이 불가합니다.");
		}

		if (p3dto.getState().equals("켜짐") && p3dto.getDmbState().equals("시청중")) {
			System.out.println("DMB를 끄시겠습니까? 끄실거면 1을 눌러주세요.");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.dmbOff(p3dto);
			}
		}

		if (p3dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있어 인터넷 사용이 불가능합니다. 전원을 먼저 켜주세요.");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.powerOn(p3dto);
			} else {
				p3dao.powerOff(p3dto);
			}
		}

		if (p3dto.getState().equals("켜짐")) {
			System.out.println("인터넷을 켜시겠습니까? 켜실거면 1을 누르세요.");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.internetOn(p3dto);
			} else {
				p3dao.internetOff(p3dto);
			}
		}

		if (p3dto.getState().equals("켜짐") && p3dto.getInternetState().equals("켜짐")) {
			System.out.println("웹툰 앱을 켜시겠습니까? 켜실거면 1을 누르세요.");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.wtAppOn(p3dto);
				System.out.println("웹툰 앱을 종료하시겠습니까? 종료하실거면 -1을 누르세요.");
				p3dao.inputInt();
				if(inputMenu == -1) {
					p3dao.wtAppOff(p3dto);
				}
			}
		} else {
			System.out.println("인터넷이 켜져있지않아 웹툰 앱을 실행 할 수 없습니다.");
		}

		if (p3dto.getState().equals("켜짐") && p3dto.getDmbState().equals("꺼짐")) {
			System.out.println("전원을 끄시겠습니까? 끄실거면 1을 눌러주세요.");
			int inputMenu = p3dao.inputInt();
			if (inputMenu == 1) {
				p3dao.powerOff(p3dto);
			}
		}

	}
}