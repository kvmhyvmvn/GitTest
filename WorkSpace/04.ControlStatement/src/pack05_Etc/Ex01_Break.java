package pack05_Etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		// break문은 제어문을 종료하고 빠져나가는 기능
		// 무한루프하는 반복문 밑에 코드가 있으면 에러(영원히 실행ㄴ)
//		while(true) {
//			while(true) {
//				break; // 하나의 제어문에 해당함(해당하는 while만 break)
//			}
//			break;
//		}
//		System.out.println("출력");

		// 무한 루프를 만들고 내가 종료를 원할때만 종료되게 만든다
		// Scanner로 -1을 입력하면 무한루프가 종료되게 만들어보자!
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("루프중");
			int num = Integer.parseInt(sc.nextLine());
			if (num == -1) {
				System.out.println("종료");
				break;
			}
		}
	}

}
