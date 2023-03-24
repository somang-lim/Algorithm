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
			int start = sc.nextInt();
			int end = sc.nextInt();

			// 1. 두 수가 같으면, 넘어감
			if (start == end) continue;

			// 2. 두 수를 맞교환
			for (int j = start - 1; j < end; j++) {
				int temp = basket[j];
				basket[j] = basket[end - 1];
				basket[end - 1] = temp;

				end--;
			}
		}

		String ans = "";
		for (int num : basket) {
			ans += num + " ";
		}

		System.out.println(ans);
	}

}
