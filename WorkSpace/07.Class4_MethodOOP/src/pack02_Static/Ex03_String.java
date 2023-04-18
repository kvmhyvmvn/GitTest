package pack02_Static;

public class Ex03_String {
	// String Class: 문자열을 조작하기 위한 기능을 담고 있는 클래스
	// java.lang(패키지).String.class(.java)
	// String 역시 Class이기 때문에 멤버를 가지고 있다
	// 다른 사람(Java, Oracle)이 만든 클래스의 기능 활용해보자
	// 변수는 소괄호가 안 붙고 메소드는 소괄호가 붙고
	public static void main(String[] args) {
		String str1 = "apple"; // apple 문자열을 str1이라는 변수에 할당
		String str2 = new String("APPLE"); // 인스턴스화 과정을 거쳐서 str2라는 변수에 APPLE 할당

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		// length() 메소드: 문자열의 길이를 알 수 있음
		System.out.println("length(): " + str1.length());

		// toUpperCase(), toLowerCase()
		// 대문자로 변경, 소문자로 변경
		System.out.println("toUpperCase(): " + str1.toUpperCase());
		System.out.println("toLowerCase(): " + str1.toLowerCase());

		// subString(): 특정 문자 추출 (index)
		// subString 메소드를 코드 자동완성 해보고 호출해보기
		System.out.println("subString(): " + str1.substring(1)); // index()부터 문자열 끝까지 출력
		System.out.println("subString(): " + str1.substring(1, 3)); // index 1부터 3의 앞까지

		// charAt(): 문자열에서 특정 문자 한글자만 추출
		System.out.println("charAt(): " + str1.charAt(4));
		System.out.println("subString(): " + str1.substring(4, 5));

		// indexOf(): 문자열에서 특정 문자의 존재여부 ▶ 존재: index 반환, 실패: -1
		System.out.println("indexOf(): " + str1.indexOf('c'));
		System.out.println("indexOf(): " + str1.indexOf('l'));

		// split(): 문자열의 분리 ▶ split() 메소드를 이용해서 split() 메소드가 리턴하는 타입의 데이터에 담아보기
		String[] temp = str1.split("");
		System.out.println(temp.length);
		String str3 = "ab cd ef";
		String[] tempArr = str3.split(" ");
		System.out.println(tempArr.length);

		// replaceAll(): 문자열 치환
		// pp라는 글자 찾아서 @@ 바꿔보기
		System.out.println(str1.replaceAll("pp", "@@"));

		// trim(): 좌우 공백 제거
		String trimStr1 = "  abc  def  ";
		System.out.println(trimStr1.trim().replaceAll(" ", "").length()); // 좌우 공백 제거, 특정문자 찾아서 치환, 문자 길이 출력

		String eqStr1 = "A";
		String eqStr2 = new String("A");
		if (eqStr1.equals(eqStr2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
