package pack03_For;

public class Ex04_ForFor {
	public static void main(String[] args) {
		// 제어문은 무한하게 중첩 가능 (순서ㄴ)

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("i" + i);
//			for (int j = 1; j <= 10; j++) {
//				System.out.println("j" + j);
//			}
//		}
		// 구구단
		for (int i = 2; i <= 9; i++) {
			System.out.println("**" + i + "단**");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print("\t" + i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}
