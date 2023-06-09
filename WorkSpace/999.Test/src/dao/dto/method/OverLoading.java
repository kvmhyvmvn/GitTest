package dao.dto.method;

public class OverLoading {
	// 메소드의 이름이 같고, 타입과 파라메터의 개수를 다르게 해서 사용할 수 있게 한 것

	void method() {

	}

	void method(int x) {
		System.out.println(x);
	}

	void method(int x, int y) {
		System.out.println(x + y);
	}

	void method(String str) {
		System.out.println(str);
	}

	void method(boolean bData) {
		System.out.println(bData);
	}

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.method();
		ol.method(7);
		ol.method(1, 1);
		ol.method("hello");
		ol.method(true);
	}
}
