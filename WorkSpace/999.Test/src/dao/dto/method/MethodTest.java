package dao.dto.method;

public class MethodTest {
	public static void main(String[] args) {
		MethodTest mtt = new MethodTest();
		mtt.method1();
		System.out.println(mtt.method2(3, 4));
	}

	public void method1() {
		System.out.println("리턴 필요없음");
	}

	public int method2(int x, int y) {
		int sum = x + y;
		return sum;
	}
}
