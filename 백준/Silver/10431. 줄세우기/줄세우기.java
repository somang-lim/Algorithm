import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(st.nextToken());

		for (int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int[] line = new int[20];

			sb.append(st.nextToken()).append(" ");
			int cnt = 0;
			for (int j = 0; j < line.length; j++) {
				line[j] = Integer.parseInt(st.nextToken());
			}

			for (int j = 0; j < line.length; j++) {
				for (int k = 0; k < j; k++) {
					if (line[k] > line[j]) {
						cnt++;
					}
				}
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}

}
