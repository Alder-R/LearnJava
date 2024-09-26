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
	}

}
