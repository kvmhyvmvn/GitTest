package pack04_OOP2;

public class StudentDTO {
	// 메소드나 변수 앞에 접근제한자라는 것을 사용하면, 외부에서의 접근을 제한 할 수 있다.
	// public, protected, default, private
	// public(공공, 공개된), private(공개되지않은, 사적인)
	// public: 같은 프로젝트 내에서 접근 가능
	// default: 같은 패키지 내에서 접근 가능
	// private: 같은 클래스 내부에서만 접근 가능

	private int num;
	private String name;
	// 외부에서 kor, mat, eng 변수에 접근해서 변경한 경우 데이터의 신뢰가 없어짐(정합성)

	// getter & setter
	// 변수 이름 앞에 get을 붙이고 변수 이름 첫번째 글자를 대문자로 바꾼 형태로
	// 외부에서의 접근이 막혀있는 변수를 메소드를 통해 접근 가능하게 만드는 구조
	// kor => getKor()메소드 => kor에 들어있는 값을 리턴해줌
	// setKor(int kor) => kor에 값을 변경해줌
	private int kor;
	private int mat, eng, sum = 0;
	private double avg;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public StudentDTO(int num, String name, int kor, int mat, int eng) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.sum = kor + mat + eng;
		this.avg = (double) sum / 3;
	}

}
