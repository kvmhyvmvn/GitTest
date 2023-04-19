package pack05_Public_Private;

import pack04_OOP2.StudentDTO;

public class Test {
	public static void main(String[] args) {
		// 패키지가 다른 곳에 Test를 만들었고 public의 접근제한자를 가진 생성자 '메소드'에 접근

		// 접근제한자가 없는 경우 default 접근제한자로 같은 패키지 내부에 있는 클래스끼리 접근 가능
		StudentDTO dto = new StudentDTO(0, null, 0, 0, 0);
		System.out.println(dto.getNum()); // 학생번호가 출력되게 하자. 어떻게 하지? 접근 제한자를 public
	}

}
