package pack01_Variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		// int a, String b ���� ���¸� ������� ��.
		// int <= ������ ��Ƽ� �����ϱ� ���� ���� Ÿ��
		// ���� a�� b��� �����̸��� ����ϰڴ� ==> ����
		int a;
		int b;
		int c;
		// ���α׷��� ������ =�� ����(���, ���� �Ҵ��ϴ�)
		a = 10; // ���� �Ҵ�(���)
		b = 20; // <= �����ݷ�: java������ �� ����
		c = 30;
		System.out.println(10);
		System.out.println(b);
		System.out.println(c);
		// int <= (����, �Ҽ����� ���� ���ڸ� ǥ���ϱ� ���� Ÿ��)
		// ������ ����� ���ÿ� �� �Ҵ�: ������ �ʱ�ȭ
		int d = 40; // ������ �ʱ�ȭ ��
		a = 50; // ����(���� ���Ѵ�) a�� 10���� 50���� �ٲ�
		System.out.println(a);
		System.out.println(d);
	}

}