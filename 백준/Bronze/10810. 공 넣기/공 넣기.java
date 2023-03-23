import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basket_count = Integer.parseInt(sc.next());
		int count = Integer.parseInt(sc.next());

		int[] basket = new int[basket_count];
		for (int cnt = 0; cnt < count; cnt++) {
			int i = Integer.parseInt(sc.next()) - 1;
			int j = Integer.parseInt(sc.next()) - 1;
			int k = Integer.parseInt(sc.next());

			for (int t = i; t <= j; t++) {
				basket[t] = k;
			}
		}

		String ans = "";
		for (int num : basket) {
			ans += num + " ";
		}

		System.out.println(ans.trim());
	}

}
