package pack01_If;

public class TestIf {
	public static void main(String[] args) {
		
		// int 1이면 남 2이면 여 3 남자 4 여자 그 외는 오류
		int code = 2;
		
		if (code == 1 || code == 3) {
			System.out.println("남자");
		}else if (code == 2 || code == 4) {
			System.out.println("여자");
		}else {
			System.out.println("오류");
		}
	
		
		// int random = (int) (Math.random() * 6) + 1; <- 해당코드가 실행되면 1~6까지의 수가 랜덤 할당
		//조건문 이용해서 random 숫자가 몇인지 출력하기
		
		int random = (int) (Math.random() * 6) + 1;
		if (random == 1) {
			System.out.println(random);
		}else if (random == 2) {
			System.out.println(random);
		}else if (random == 3) {
			System.out.println(random);
		}else if (random == 4) {
			System.out.println(random);
		}else if (random == 5) {
			System.out.println(random);
		}else {
			System.out.println(random);
		}
		
		// 주사위 게임
		int me = (int) (Math.random() * 6) + 1;
		int pc = (int) (Math.random() * 6) + 1;
		
		if (me > pc) {
			System.out.println("나: " + me + ", " + "컴퓨터: " + pc + " => " + "결과: 사용자가 이겼습니다.");
		}else if (me < pc) {
			System.out.println("나: " + me + ", " + "컴퓨터: " + pc + " => " + "결과: 컴퓨터가 이겼습니다.");
		}else {
			System.out.println("나: " + me + ", " + "컴퓨터: " + pc + " => " + "결과: 숫자가 같습니다.");
		}
		
	}

}
