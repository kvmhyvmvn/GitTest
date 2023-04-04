package pack01_If;

public class Ex02_IfElse {
	public static void main(String[] args) {
		// if문: 단순 if (조건식을 주고 해당하는 조건식이 TRUE인 경우를 만들어서 코드 실행)
		// if else문: 단순 if문은 조건식이 TRUE일 때만 실행되는 번거로움ㅇ
		// if의 조건식이 TRUE가 아니라 FALSE라면 else라는 키워드를 붙여 FALSE 실행부를 만드는 것
		int score = 85;
		if (score % 2 == 0) {
			// TRUE
			System.out.println("짝수");
		} else { // 문법 자체가 if문이 true가 안나왔을 때 사용하기 때문에 반드시 if문이 있을 때만 사용
			// FALSE
			System.out.println("홀수");
		}
		
		System.out.println("===================");
		
		int num1 = 11, num2 = 12;
		if (num1 > num2) {
			System.out.println("더 큰 수는 " + num1 + "이다.");
		} else {
			System.out.println("더 큰 수는 " + num2 + "이다.");
		}
		
	}// main

}// class
