package myArray;

public class MyArray2 {

	public static void main(String[] args) {
		int score[] = {20, 10, 50, 80, 35, 99, 98};
		int max = 0, min = 100, sum = 0;
		for (int i = 0; i < 7; i++) {
			System.out.println((i+1) + "번 심사 위원 점수: " + score[i]);
			if (score[i] > max) { max = score[i]; };
			if (score[i] < min) { min = score[i]; };
			sum = sum + score[i];
		}
		System.out.println("최고 점수와 최저 점수를 제외한 5명의 평균 점수: " + (sum-max-min)/5);
	}

}
