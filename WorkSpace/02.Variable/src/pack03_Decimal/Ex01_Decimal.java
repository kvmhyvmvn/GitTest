package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		// int 이상의 값을 담을 수 있는 정수형 데이터타입이 존재
		
		long l1;
		long l2 = 1234567890123456789L; // 숫자 + long타입이라는 구분자가 있다.(뒤에 'L' 붙여주자)
		System.out.println(l2);
		
		// 실수형 데이터 타입: float, double
		// 실수형은 소숫점이 있는 것을 표현하기 위해 존재
		// float는 long과 마찬가지로 구분자 F를 붙여줘야만함.
		float f1;
		f1 = 0.12345F;
		float f2 = 1.23456F;
		
		double d1;
		d1 = 3.1456789;
		double d2= 2.34567;
		// 뒤에 구분자가 붙는 long, float 편하다?
		// 대표적 : int, double
	}

}
