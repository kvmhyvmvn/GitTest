package pack06_Game;

import java.util.Scanner;

public class Ex02_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요 : ");
		int kor = Integer.parseInt(sc.nextLine());
		if (kor < 0 || kor > 100) {
			System.out.println("오류");
			System.out.println("다시 입력하세요 : ");
			kor = Integer.parseInt(sc.nextLine());
		}
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = Integer.parseInt(sc.nextLine());
		if (eng < 0 || eng > 100) {
			System.out.println("오류");
			System.out.println("다시 입력하세요 : ");
			eng = Integer.parseInt(sc.nextLine());
		}
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = Integer.parseInt(sc.nextLine());
		if (mat < 0 || mat > 100) {
			System.out.println("오류");
			System.out.println("다시 입력하세요 : ");
			mat = Integer.parseInt(sc.nextLine());
		}
		int sum;
		double avg;
		sum = kor + eng + mat;
		avg = (kor + eng + mat) / 3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
