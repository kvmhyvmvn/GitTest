import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputData1 = sc.nextLine();
		
		// 콘솔창에 통해서 입력받아온 String 데이터를 int로 바꾼 후 해당 숫자가 짝, 홀 판단 후 콘솔창에 출력
		int iNum = Integer.parseInt(inputData1);
		String result = iNum % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);

		// 콘솔창을 통해서 String 데이터를 두개 입력 받는다
		// 각각의 숫자는 num1, num2
		// 두 숫자의 더하기, 빼기, 곱하기, 나누기 출력
		String inputData2 = sc.nextLine();
		String inputData3 = sc.nextLine();
		int num1 = Integer.parseInt(inputData2);
		int num2 = Integer.parseInt(inputData3);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		// 두 숫자 중 더 큰 숫자가 어떤 숫자인지 표시
		int iResult = num1 < num2 ? num2 : num1;
		System.out.println("더 큰 숫자는 " + iResult +"입니다.");
	}

}
