import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt(); // 열
		int H = sc.nextInt(); // 행
		int P = sc.nextInt(); // 열 좌표
		int Q = sc.nextInt(); // 행 좌표
		int T = sc.nextInt(); // 시간
		
		int xt = T % (2 * W); // 열
		boolean flag = false;
		
		for (int i = 0; i < xt; i++) {
			// flag 가 true 인 경우에는 1씩 감소, false 인 경우에는 1씩 증가 -> 벽에 부딪치는 상황 구현
			if (!flag) P++;
			else P--;
			if (P == W) flag = true;
			else if (P == 0) flag = false;
		}
		
		int yt = T % (2 * H); // 행
		flag = false;
		
		for (int i = 0; i < yt; i++) {
			if (!flag) Q++;
			else Q--;
			if (Q == H) flag = true;
			else if (Q == 0) flag = false;
		}

		System.out.println(P + " " + Q);
	}

}
