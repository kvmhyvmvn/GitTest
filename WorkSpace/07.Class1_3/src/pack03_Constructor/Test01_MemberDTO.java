package pack03_Constructor;

public class Test01_MemberDTO {
	public static void main(String[] args) {
		Test01_Member tm = new Test01_Member("김혜민", "rlagPals", "rlagPals1234", 25);
		
		tm.name = "김혜민";
		tm.id = "rlagPals";
		tm.pw = "rlagPals1234";
		tm.age = 25;
		System.out.println("이름: " + tm.name);
		System.out.println("아이디: " + tm.id);
		System.out.println("비밀번호: " + tm.pw);
		System.out.println("나이: " + tm.age);
		System.out.println("================================");
		System.out.println("이름: " + tm.name);
		System.out.println("아이디: " + tm.id);
		System.out.println("비밀번호: " + tm.pw);
		System.out.println("나이: " + tm.age);
	}
}
