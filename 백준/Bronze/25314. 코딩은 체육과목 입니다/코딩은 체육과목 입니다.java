import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n_byte = Integer.parseInt(sc.next());

		String byte_name = "";

		if (n_byte == 4) {
			byte_name = "long int";
			System.out.println(byte_name);
		} else if (n_byte > 4) {
			n_byte /= 4;

			for (int i = 0; i < n_byte; i++) {
				byte_name += "long ";
			}
			byte_name += "int";

			System.out.println(byte_name);
		}
	}

}
