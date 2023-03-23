import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basket_count = sc.nextInt();
		int count = sc.nextInt();

		int[] basket = new int[basket_count];

		for (int i = 0; i < basket_count; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < count; i++) {
			int ch_1 = sc.nextInt() - 1;
			int ch_2 = sc.nextInt() - 1;

			if (ch_1 == ch_2) continue;

			int temp = basket[ch_1];
			basket[ch_1] = basket[ch_2];
			basket[ch_2] = temp;
		}

		String ans = "";
		for (int num : basket) {
			ans += num + " ";
		}

		System.out.println(ans);
	}

}
