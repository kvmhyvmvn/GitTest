package pack04_While;

public class Ex02_While {
	public static void main(String[] args) {

		int i = 1;
		int result = 0;

		while (i <= 10) {
			result += i;
			i++;
		}
		System.out.println(result);
	}

}
