package pack09_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
//		Scanner (입력) => 자바 / (출력) => 콘솔창
		Scanner sc = new Scanner(System.in); //클래스의 초기화식
		System.out.println("대기할건지?");
		String inputData = sc.nextLine();
		System.out.println("?");
//		외부에서 입력한 숫자는 String 형태로 inputData라는 변수에 들어온다.
		int iNum = Integer.parseInt(inputData) + 10;
		System.out.println(iNum);
	}
}