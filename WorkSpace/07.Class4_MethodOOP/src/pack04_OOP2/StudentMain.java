package pack04_OOP2;

public class StudentMain {
	// private <> public

	public static void main(String[] args) {
		StudentDTO dto1 = new StudentDTO(1, "김혜민", 69, 77, 89);
		StudentDAO dao = new StudentDAO();
		dao.display(dto1);

	}
}
