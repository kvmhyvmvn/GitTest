package pack02_Static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
		
		Test01_Method tm = new Test01_Method();
		
		Scanner sc = new Scanner(System.in);
		tm.id = sc.nextLine();
		tm.pw = sc.nextLine();
		
		System.out.println(tm.login());
			
	}

}
