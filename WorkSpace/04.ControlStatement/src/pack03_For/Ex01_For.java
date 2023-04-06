package pack03_For;

public class Ex01_For {
	public static void main(String[] args) {
		// 반복문: for문(loop문, looping, 순환)
		// 사용 이유: 기계는 사람보다 반복적인 작업을 잘함(정확, 일정)
		// for (반복에 사용할 변수; 조건식; 증감식) {
		// 반복구간 (코드 넣어라)
		// }

		// for(int i=0; i<10; i++) {
		// i가 0에서 9까지 총 10번 동작하는 반복문
		// 증감식을 주지 않았을 때 무한 루프: 잘못된 반복문의 예시
		for (int i = 0; i < 10; i++) {
			System.out.println("for문 변수 i의 값: " + i);
		}
		
		int fNum = 0;
		for (int i = 0; i<9; i+=2) {
			System.out.println("짝수: " + i);
			fNum = i;
		}
		System.out.println("i의 최종값: " + fNum);
	}

}
