import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cur = sc.next();
		String drop = sc.next();

		// 1. ':' 문자를 기준으로 시간, 분, 초를 쪼갠다.
		int cur_h = Integer.parseInt(cur.substring(0, 2));
		int cur_m = Integer.parseInt(cur.substring(3, 5));
		int cur_s = Integer.parseInt(cur.substring(6, 8));

		int drop_h = Integer.parseInt(drop.substring(0, 2));
		int drop_m = Integer.parseInt(drop.substring(3, 5));
		int drop_s = Integer.parseInt(drop.substring(6, 8));

		// 2. 두 시간, 분, 초의 차이를 계산한다.
		int gap_h = drop_h - cur_h;
		int gap_m = drop_m - cur_m;
		int gap_s = drop_s - cur_s;

		if (gap_s < 0) {
			gap_s += 60;
			gap_m--;
		}
		if (gap_m < 0) {
			gap_m += 60;
			gap_h--;
		}
		if (gap_h <= 0) {
			gap_h += 24;
		}
    
        // 3. 구해진 시간을 HH:MM:SS 형태로 출력한다.
		System.out.printf("%02d:%02d:%02d", gap_h, gap_m, gap_s);
	}

}
