package pack02.Phone;

public class Phone2DAO extends Phone1DAO {

	public String dmbOn(Phone2DTO dto) {
		System.out.print("DMB 방송을 켭니다.");
		System.out.println(" 현재 채널: " + dto.getChannel() + ". 정보없음");
		dto.setDmbState("시청중");
		return dto.getDmbState();
	}

	public String dmbOff(Phone2DTO dto) {
		System.out.println("DMB 방송을 끕니다.");
		dto.setDmbState("꺼짐");
		return dto.getDmbState();
	}

	public void changeChannel(Phone2DTO dto) {
		while (true) {
			System.out.println("DMB방송의 채널을 변경합니다. 채널 번호를 입력해주세요");
			System.out.println("(채널 변경 중단: -1)");
			dto.setChannel(inputInt());
			if (dto.getChannel() == -1) {
				System.out.println("채널 변경을 중단합니다.");
				break;
			} else {
				System.out.println("채널: " + dto.getChannel() + "번으로 번경됨.");

			}
		}

	}
}