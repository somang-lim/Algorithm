import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();

		int count = 0;
		int start_idx = 0;

        for (int i = 0; i < doc.length(); i++) {
			boolean match = true;
			for (int j = 0; j < word.length(); j++) {
				if (i + j >= doc.length() ||
					doc.charAt(i + j) != word.charAt(j)) {
					match = false;
					break;
				}
			}

			if (match) {
				count++;
				i += word.length() - 1;
			}
		}

		System.out.println(count);
	}

}
