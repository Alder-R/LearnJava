package myMidTest;

public class Test4 {

	public static void main(String[] args) {
		String[][] fruit = {{"딸기","포도"},{"복숭아","배"},{"참외","사과"},{"수박","오렌지"}};
		for(int i=0; i<fruit.length; i++) {
			for(int j=0; j<fruit[0].length; j++) {
				System.out.print("\t"+fruit[i][j]);
			}
		}
	}

}
