import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cur = sc.next().split(":");
		String[] drop = sc.next().split(":");

		// 1. ':' 문자를 기준으로 시간, 분, 초를 쪼갠다.
		int cur_h = Integer.parseInt(cur[0]);
		int cur_m = Integer.parseInt(cur[1]);
		int cur_s = Integer.parseInt(cur[2]);

		int drop_h = Integer.parseInt(drop[0]);
		int drop_m = Integer.parseInt(drop[1]);
		int drop_s = Integer.parseInt(drop[2]);

		// 2. 두 시간, 분, 초의 차이를 계산한다. --> 제일 작은 단위로 통합
		int cur_second = cur_h * 60 * 60 + cur_m * 60 + cur_s;
		int drop_second = drop_h * 60 * 60 + drop_m * 60 + drop_s;
		int gap_second = drop_second - cur_second;
		if (gap_second <= 0) gap_second += 24 * 60 * 60;

		int gap_h = gap_second / (60 * 60);
		int gap_m = (gap_second % 3600) / 60;
		int gap_s = gap_second % 60;

		// 3. 구해진 시간을 HH:MM:SS 형태로 출력한다.
		String ans = String.format("%02d:%02d:%02d", gap_h, gap_m, gap_s);
		System.out.println(ans);
	}

}
