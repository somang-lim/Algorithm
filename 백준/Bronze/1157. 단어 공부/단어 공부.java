import java.util.Scanner;

public class Main {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'A']++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();

		// 1. 알파벳 개수 세기
		int[] count = getAlphabetCount(str);

		// 2. 가장 많이 사용된 알파벳 도출하기
		int max_count = -1;
		char max_alphabet = '?';
		for (int i = 0; i < 26; i++) {
			if (count[i] > max_count) {
				max_count = count[i];
				max_alphabet = (char)('A' + i);
			}
            else if (count[i] == max_count) {
				max_alphabet = '?';
			}
		}

		System.out.println(max_alphabet);
	}
}