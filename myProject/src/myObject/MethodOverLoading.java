package myObject;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		Add han = new Add();
		int x = han.sum(10, 25);
		System.out.println(x);						// ����
		System.out.println(han.sum(50, 6));			// ���ڿ� ����
		System.out.println(han.sum("����","Ư����"));	// ���ڿ� ����
		
		System.out.println("----------------");
		Multiply dul = new Multiply();
		System.out.println(dul.sum(2, 3, 2));		// ����
		System.out.println(dul.sum(2, 4));			// �ŵ�����
	}
	
}

class Add {
	int sum(int i1, int i2) {			// ����
		return i1 + i2;
	}
	String sum(String s1, String s2) {	// ���ڿ� ����
		return s1 + s2;
	}
}

class Multiply {
	int sum(int i1, int i2, int i3) {	// ����
		return i1 * i2 * i3;
	}
	double sum(int i1, int i2) {
		double i = Math.pow(i1, i2);	// �ŵ�����
		return i;
	}
}