
public class Ex08_Oper {
	public static void main(String[] args) {
		// 비교 연산자: 조건문에 많이 사용
		// 조건: 어떤 식이 참인지 거짓인지 판단하는 것
		// id, pw가 내가 입력한 값과 db에 입력한 값이 일치? 로그인 또는 아이디 비번 확인하세요~
		// 조건은 반드시 true와 false의 값을 얻을 수 있어야 함
		int num1 = 10, num2 = 10;
		//== 같다, !=같지않다, 이상, 이하, 초과, 미만
		// 조건식을 사용하고 나서는 결과가 반드시 true, false가 나온다
		boolean result1 = num1 == num2; // true? false? - 10과 10이 같은지? true
		boolean result2 = num1 != num2; // true? false? - 10과 10이 다른지? false
		boolean result3 = num1 <= num2; // true? false? - 10은 10 이하인가? true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		boolean result4 = num1 >= num2;  // true
		boolean result5 = num1 < num2;  // false
		boolean result6 = num1 > num2;  // false
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
		// 식을 연결 = 논리 연산자(여러 개의 조건을 판단)
		// 최종적인 결과는 True, False의 결과만 나온다.
		// 조건식A && 조건식B: A가 참, B도 참일 경우 => True 그 외에는 False
		// && (AND, *, 논리곱) : 1 * 1 = 1, 1 * 0 = 0
		// 조건식A || 조건식B: A가 참이면 B의 조건과 상관없이 => True
		// || (OR, +, 논리합) : 1 + ? = 0, 0 + 0 = 0 => A이거나, B 또는
		System.out.println("==============구분==============");
		System.out.println(10 > 5 && 20 > 5); // 결과는 true
		System.out.println(10 > 5 && 20 < 5); // 결과는 false
		System.out.println(5 > 10 && 20 > 5); // 결과는 false 하나의 false가 발생하면 뒤에 조건은 비교 ㄴㄴ
		System.out.println(5 > 10 && 5 > 20); // 위랑 마찬가지
		System.out.println("==============구분==============");
		System.out.println(10 > 5 || 20 > 5); // 결과는 true 하나의 true가 발생하면 뒤에 조건은 비교 ㄴㄴ
		System.out.println(10 > 5 || 20 < 5); // 결과는 true 위랑 마찬가지
		System.out.println(5 > 10 || 20 > 5); // 결과는 true
		System.out.println(5 > 10 || 5 > 20); // 결과는 false
		
		System.out.println(10 > 5 && 20 > 5 || 5 > 10); // 
	}
}
