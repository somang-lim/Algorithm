import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int col_sum = 0;
		int row_sum = 0;

		boolean[][] castle = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == '.') castle[i][j] = false;
				if (str.charAt(j) == 'X') castle[i][j] = true;
			}
		}

		// 열 검사
		for (int i = 0; i < M; i++) {
			int count = 0;

			for (int j = 0; j < N; j++) {
				if (castle[j][i]) count++;
			}

			if (count == 0) col_sum++; // 열에 필요한 경비원 수
		}

		for (int i = 0; i < N; i++) {
			int count = 0;

			for (int j = 0; j < M; j++) {
				if (castle[i][j]) count++;
			}

			if (count == 0) row_sum++; // 행에 필요한 경비원 수
		}

		System.out.println(row_sum >= col_sum ? row_sum : col_sum);
	}

}
