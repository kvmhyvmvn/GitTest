package pack01_If;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		// if else 문으로는 어떤 조건을 줄 때 true인지 false인지 두가지 경우만 생성 가능
		// if (조건식a) {
			// 조건식a가 true일 때 실행할 코드를 넣어줌
		// else if (조건식b) {
			// 조건식a가 true가 아니고 조건식b일때 실행할 코드
		// }
		// else if (조건식c) {
			// 조건식a와 b가 true가 아니고 조건식c일때 실행할 코드
		// }
		// else {
			// 조건식a가 true가 아닐 때 실행할 코드를 넣어줌 (규칙: if문 블럭킹 끝에 붙여서 사용)
		// }
	// }
		int score = 70; // score 90 이상이면 A 80 이상이면 B 70 이상이면 C 그 외에는 D
		if (score >= 90){
			System.out.println("A");
		}
		if (score >= 80 && score <= 89) {
			System.out.println("B");
		}
		if (score >= 70 && score <= 79) {
			System.out.println("C");
		}
		if (score < 70){
			System.out.println("D");
		}
		
		
		if(score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		}else {
			System.out.println("E");
		}
		
		
	}
}
