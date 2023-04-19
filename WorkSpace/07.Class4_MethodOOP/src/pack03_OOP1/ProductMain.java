package pack03_OOP1;

public class ProductMain {
	public static void main(String[] args) {
		// 상품 두개를 생성하기
		// 1. 컴퓨터, 2. 노트북
		// display() 메소드를 이용해서 내용 출력하기
		
//		Product p1 = new Product();
//		p1.display(1, "컴퓨터");
//		
//		Product p2 = new Product();
//		p2.display(2, "노트북");
		
		ProductDTO dto = new ProductDTO();
		dto.num = 1;
		dto.name = "컴퓨터";
		ProductDTO dto2 = new ProductDTO();
		dto2.name = "노트북";
		dto2.num = 2;
		
		ProductDAO dao = new ProductDAO();
		dao.display(dto);
		dao.display(dto2);
		
	
	}
}
