package pack03_OOP1;

public class ProductDAO {
	// 기능만 있음
	// 필요에 따라서 필드에 변수를 만들기도 함
	
	void display(ProductDTO dto) {
		System.out.println("번호: " + dto.num);
		System.out.println("상품명: " + dto.name);
	}
	
	void input() {
		System.out.println("상품 추가하기");
	}

}
