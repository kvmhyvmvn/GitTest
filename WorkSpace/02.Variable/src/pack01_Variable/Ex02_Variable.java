package pack01_Variable;

public class Ex02_Variable {
	public static void main(String[] args) {
		int a; // 이클립스는 오류코드 외에도 메모리를 생각해서
				// 불필요한 변수는 지우라고 추천함.
		int b;
		b = 30;
		int c = 40;
		System.out.println(b);
		System.out.println(c);
		// 현 a, b, c 쓰고 있음 => 문제점?
		// 같이 협업할 때 이 변수 자체를 왜 만들었는지 모름
		// 변수명(식별자) 작성 규칙
		// -반드시 알파벳 소문자로 시작할 것!
		// -자바에서 미리 쓰고있는 예약어(static)는 사용 불가능
		// -띄어쓰기 x
		// -글자수에 제한 없음. 다만 어떤 내용의 변수인지를 알아볼 수 있는 단어가 좋다.(단어 연결 가능)
		// class(.java)를 만들 때는 대문자로 시작
		int num = 10;
	}

}
