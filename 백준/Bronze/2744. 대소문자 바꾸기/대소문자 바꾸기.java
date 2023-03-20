import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// 1. 대문자/소문자 구별
			if ('A' <= ch && ch <= 'Z') {
                // 2. 대문자 --> 소문자
				System.out.print((char) ('a' + ch - 'A'));
			} else {
                // 2. 소문자 --> 대문자
				System.out.print((char) ('A' + ch - 'a'));
            }
		}
	}
}