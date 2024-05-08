
package myPack;

public class myTest {

	public static void main(String[] args) {
		
		System.out.println("□요일 아침입니다.");
		
		char ad = '\62'; // 2
		char af = '\u0041'; // A
		System.out.println(ad); // 2
		System.out.println(af); // A
		
		int a[] = new int[]{3,6,9,12,15};
		System.out.println(a.length); // 5
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]); 
			System.out.print(' '); // 3 6 9 12 15 순서대로 출력
		}
		System.out.println();
		
		int b[] = new int[3];
		System.out.println(b.length); // 3
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]); // int 배열의 기본값은 0
		}
	}

}

class a {
	
}

class b {
	
}