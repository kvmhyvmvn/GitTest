package pack01_Base;

public class Ex02_CaculatorMain {
	public static void main(String[] args) {
		Ex02_Caculator ec = new Ex02_Caculator();
		ec.powerOn(0);
		ec.powerOff();
		int result  = ec.test()+10; // int타입을 무조건 return함. => int형 변수랑 같이 취급
		System.out.println(result);
		// String inputData = sc.nextLine(); // <- nextLine() == String을 return하는 메소드
		result = ec.plus(5, 10);
		System.out.println(result);
		System.out.println(ec.plus3(1, 2, 3));
		System.out.println(ec.plus3(1, 2, 3)/3); // 평균
	  
	}
	
}
