
public class Test01 {
	public static void main(String[] args) {
		
//		int iNum;   //선언 
//		char cChr;
//		double dNum;
//		String str;
//		
//		iNum=10;         //할당
//		cChr = 'A';
//		dNum = 3.14;
//		str = "Hello";
//		
//		int iNum2 = 20;     //초기화
//		char cChr2 = 'B';
//		double dNum2 = 1.15;
//		String str2 = "김혜민";
		
		String numStr = "123";
		int num = Integer.parseInt(numStr);
		System.out.println(num + 10);
		String numStr2 = "" + num;     // 숫자에 + "" 해주면 문자열
		System.out.println(numStr2);
	}

}
