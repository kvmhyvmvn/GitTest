package pack01_Base;

import java.util.Scanner;

public class Ex06_Method {

	void method1() {
		System.out.println(" method1 ");
	}

	void method2(String data) {
		if (data == null) {
			return; // 리턴 만나면 블럭 끝으로 이동, syso 출력 ㄴㄴ
		}
		System.out.println(" method2 " +data);
	}

	String method3() {
		System.out.println(" method3 ");
		return null;
	}

	int method4(int x, int y) {
		int sum = x + y;
		System.out.println(" method4 " + sum);
		return sum;
	}

	String sMethod() {
		return "abc";
	}

	double dMethod() {
		return 3.14;
	}

	int[] aMethod() {
		return new int[1];
	}

	Scanner scanMethod() {
		return new Scanner(System.in);
		// null을 리턴하게 되면 해당 메소드를 이용해서 스캐너 기능 사용시 NullPointException 발생
	}

}
