package myProject;

public class test {

	public static void main(String[] args) {
		System.out.println(Solution.solution("He11oWor1d", "lloWorl", 2));
		System.out.println(Solution.solution("Program29b8UYP", "merS123", 7));
		System.out.println(Solution.solution("ABCD123123567", "EFG", 4));
		System.out.println(Solution.solution("가나다라마바사마바사", "아자차", 7));
	}

}

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
    	String a = my_string.substring(s,(s + overwrite_string.length()));
    	System.out.println("a의 값: " + a);
    	String b = overwrite_string.substring(0,(overwrite_string.length()));
    	System.out.println("b의 값: " + b);
    	System.out.println(System.identityHashCode(a));
        my_string = my_string.replace(a, b);   
        String answer = my_string;
        return answer;
    }
}