
public class Ex02_Operator {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1;
		System.out.println(num1++); // 후행연산 (뒤에 증감식이 붙은 것)
		System.out.println(++num2); // 선행연산 (앞에 증감식이 붙은 것)
		
		// ++ 현재 수 +1
		
		System.out.println("증감식 후: " + num1);
		System.out.println("증감식 후: " + num2);
		
		System.out.println(num1--); // 2가 나올 것 같다 '출력 후' 2-1 연산
		System.out.println(--num2); // 1이 나올 것 같다 2-1 '연산 후' 출력
	}

}
