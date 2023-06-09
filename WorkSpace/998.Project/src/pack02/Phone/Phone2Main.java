package pack02.Phone;

public class Phone2Main {
	public static void main(String[] args) {
		Phone2DAO p2dao = new Phone2DAO();
		Phone2DTO p2dto = new Phone2DTO("검정", "이니셜-2", "꺼짐", "대기중");

		System.out.print("색상: " + p2dto.getColor() + ", ");
		System.out.print("모델명: " + p2dto.getModel() + ", ");
		System.out.print("상태: " + p2dto.getState() + ", ");
		System.out.println("채널: " + p2dto.getChannel());

		System.out.println();
		if (p2dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜시겠습니까?");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.powerOn(p2dto);
			} else {
				p2dao.powerOff(p2dto);
			}
		}

		if (p2dto.getState().equals("켜짐")) {
			System.out.println("전화를 받으시겠습니까? 받으실거면 1번을 누르세요.(거절은 2번입니다.)");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.call(p2dto);
			} else if (inputMenu == 2) {
				p2dao.refuseCall(p2dto);
			}
		} else {
			System.out.println("전원이 꺼져있어 전화 받기가 불가합니다. 전원을 먼저 켜주세요.");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.powerOn(p2dto);
			} else {
				p2dao.powerOff(p2dto);
			}
		}

		if (p2dto.getState().equals("꺼짐") && p2dto.getCallState().equals("대기중")) {
			System.out.println("전원이 꺼져있어 DMB를 켤 수 없습니다. 전원을 먼저 켜주세요.");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.powerOn(p2dto);
			} else {
				p2dao.powerOff(p2dto);
			}
		}

		if (p2dto.getState().equals("켜짐") && p2dto.getCallState().equals("대기중")) {
			System.out.println("DMB방송을 켜시겠습니까? 방송을 켜시려면 1을 눌러주세요. (그 외에는 종료)");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.dmbOn(p2dto);
			} else {
				p2dao.dmbOff(p2dto);
			}
		} else if (p2dto.getState().equals("켜짐") && p2dto.getCallState().equals("전화중")) {
			System.out.println("통화 중인 상태에서는 DMB 방송을 켤 수 없습니다.");
			System.out.println("전화를 끊으실거면 1을 눌러주세요.");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.hangUp(p2dto);
				p2dao.dmbOn(p2dto);
			}
		}

		if (p2dto.getState().equals("켜짐") && p2dto.getDmbState().equals("시청중")) {
			p2dao.changeChannel(p2dto);
		} else {
			System.out.println("DMB가 켜져있지않아 채널 변경이 불가합니다.");
		}

		if (p2dto.getState().equals("켜짐") && p2dto.getDmbState().equals("시청중")) {
			System.out.println("DMB를 끄시겠습니까? 끄실거면 1을 눌러주세요.");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.dmbOff(p2dto);
			}
		}

		if (p2dto.getState().equals("켜짐") && p2dto.getDmbState().equals("꺼짐")) {
			System.out.println("전원을 끄시겠습니까? 끄실거면 1을 눌러주세요.");
			int inputMenu = p2dao.inputInt();
			if (inputMenu == 1) {
				p2dao.powerOff(p2dto);
			}
		}

	}

}