import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        char[] answer = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
            if ('a' <= answer[i] && answer[i] <= 'z')
                answer[i] = (char) ('A' + answer[i] - 'a');
            else 
                answer[i] = (char) ('a' + answer[i] - 'A');
		}
        
        System.out.println(answer);
	}
}