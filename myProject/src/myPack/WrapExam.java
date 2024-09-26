package myPack;

public class WrapExam {

	public static void main(String[] args) {
		Integer in1 = new Integer("1234");
		Integer in2 = new Integer(1234);
		System.out.println(in1 + "\t" + in2 + "\t" + in1.equals(in2));
		int i1 = 1234;
		System.out.println(in1.equals(i1) + "\t" + in2.equals(i1));
		
		System.out.println(in1);
		System.out.println(in1.toString() + in2.toString());
		System.out.println(in1 + in2);
		
		Double PI = new Double(3.14);
		System.out.println(Double.toString(PI));
		System.out.println(PI - .14 + "\t" + PI);
		
		String str1 = "30", str2 = "7.5";
		// String값을 정수나 실수형 Wrapper로 변환
		System.out.println(Integer.valueOf(str1) + Float.valueOf(str2));
		System.out.println(str1 + str2);
		
		double i2 = Double.parseDouble(str2);
		System.out.println(i2 + 2.4);
	}

}
