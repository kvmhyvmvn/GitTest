package pack01_Base;

public class Ex02_Caculator {
	// static 키워드가 있는지 없는지의 판단(멤버 구분의 매우 중요함)
	// 메소드의 구조
	// 생성자 메소드(Constructor): 객체를 생성할 때 필요한 메소드
	
	// 메소드 구조:
	// 리턴타입 메소드이름 (파라미터부) {
	// 메소드 내용(코드)
	//}
	// 파라미터부: 어떤 것이든 메소드가 실행 될 때 필요한 (변수, 클래스 등) 정보가 있다면 받아오게끔 처리하는 부분
	void powerOn(int power) { // 숫자
		if(power < 1) {
			System.out.println("배터리 부족으로 실행불가");
			powerOff();
		} else {
			System.out.println("전원을 켭니다.");
		}
	}
	// powerOff에서 main에 접근이 되는 이유?
	// - static이 먼저 컴파일 되기 때문에 접근 가능하다. (메모리에 있다)
	//main에서 powerOff에 접근이 안되는 이유?
	// - static이 먼저 컴파일 되기 때문에 main 시점에서는 powerOff가 아직 정의되지않아서 참조가 불가능하다.
	// (메모리에 없다)
	void powerOff() {
		System.out.println("전원을 끕니다.");
		// main(null);
	}
	
	// void인지 void가 아닌지에 따라 리턴타입이 결정된다.
	// 내가 알고 있는 모든 타입 => 리턴타입으로 사용 가능
	// void <- (공허, 비어있는): 리턴이 없는 (작업 후 결과가 필요없는)
	
	// return 타입이 void가 아니게 주어지면 해당하는 타입을 반환하는 return 키워드가 반드시 필요하다.
	int test() {
		return 0;
	}
	
	int plus(int num1, int num2) { // 1. 파라미터부에 숫자를 두개 입력받게 만들기
				 					// 2. 입력받은 파라미터 두 숫자의 합을 return하게 코딩해보기
		int sum = num1 + num2;
		return sum; // return이 되면 메소드 자체가 메모리에서 사라짐
		
	}
	
	//숫자 세개 입력받아서 3개의 합을 구하는 메소드
	int plus3(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static void main(String[] args) {
		// powerOff();
	}

}
