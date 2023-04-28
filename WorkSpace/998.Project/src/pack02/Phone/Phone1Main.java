package pack02.Phone;

public class Phone1Main {
	public static void main(String[] args) {
		Phone1DAO p1dao = new Phone1DAO();
		Phone1DTO p1dto = new Phone1DTO("검정", "이니셜-1", "꺼짐", "대기중");

		System.out.println("색상:" + p1dto.getColor());
		System.out.println("모델명:" + p1dto.getModel());
		System.out.println("상태:" + p1dto.getState());

		System.out.println();
		if (p1dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜시겠습니까?");
			System.out.println("전원을 켜시려면 1을 눌러주세요. (그 외에는 꺼짐)");
			int inputMenu = p1dao.inputInt();
			if (inputMenu == 1) {
				p1dao.powerOn(p1dto);
			} else {
				p1dao.powerOff(p1dto);
			}
		}
		p1dao.callOn(p1dto);
		p1dao.callOff(p1dto);
	}
}
