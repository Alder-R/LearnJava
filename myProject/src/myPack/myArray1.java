
package myPack;

public class myArray1 {

	public static void main(String[] args) {
		// 선언		생성			초기화
		int b[] = new int[]{10,20,30,40,50}; // 배열 선언, 생성, 초기화 총 세 과정을 한 줄로(이 경우 생성에서 길이 지정 X)
		
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]+5); // 줄바꿈으로 구별
		}
		
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+5);
			System.out.print(' '); // 공백으로 구별
		}
		
		System.out.println();
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		String c[] = new String[10];
		c[0] = "김이름";
		c[1] = "전ㄴㄴ";
		c[3] = "이성명";
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]); // String 배열의 기본값은 null
		}
		
		int f[][] = {{0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,0},
					 {0,0,0,1,3,1,0,0},
					 {0,1,0,1,0,0,0,1},
					 {0,1,0,1,1,1,1,1},
					 {0,1,0,0,0,0,0,0},
					 {0,1,0,1,1,1,1,1},
					 {2,0,0,1,1,1,1,1}};
		for(int i=0; i<f.length; i++){
			for(int j=0; j<f[i].length; j++){
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
		
	}

}
