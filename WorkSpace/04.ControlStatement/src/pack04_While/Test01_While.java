package pack04_While;

public class Test01_While {
	public static void main(String[] args) {

		// 구구단 가로 출력
		int i = 2;
		while (i <= 9) {
			int j = 1;
			System.out.print("*" + i + "단" + "=> ");
			while (j <= 9) {
				System.out.print(i + "x" + j + "=" + (i * j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("=============================================================");
		
		// 구구단 세로 출력
		int k = 2;
		while (k <= 9) {
			int l = 1;
			System.out.println("\n" + "**" + k + "단" + "**");
			while (l <= 9) {
				System.out.println(k + "x" + l + "=" + (k * l) + " ");
				l++;
			}
			k++;
			
		}
		
	}

}

