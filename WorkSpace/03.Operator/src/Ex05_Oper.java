
public class Ex05_Oper {
	public static void main(String[] args) {
		int result = 0;
		// result에 10을 더한 결과를 다시 result에 할당
		result += 10;  // result = result + 10을 줄여서 쓴 것, 복합대입연산자
		result += 10;
		System.out.println(result);
		result += 10;
		result += 10;
		System.out.println(result + 10); // 출력값은 50이지만 result에 저장된 값은 40이다.
		System.out.println(result);  // 결과값은 40 (할당이 있어야지만 값이 저장 됨)
	}

}
