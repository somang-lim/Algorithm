import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double GPA = 0;
		double plus = 0;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double grade_num = 0;

			switch (grade) {
				case "A+" :
					grade_num = 4.5;
					break;
				case "A0" :
					grade_num = 4.0;
					break;
				case "B+" :
					grade_num = 3.5;
					break;
				case "B0" :
					grade_num = 3.0;
					break;
				case "C+" :
					grade_num = 2.5;
					break;
				case "C0" :
					grade_num = 2.0;
					break;
				case "D+" :
					grade_num = 1.5;
					break;
				case "D0" :
					grade_num = 1.0;
					break;
				case "F" :
					grade_num = 0.0;
					break;
			}

			if (!grade.equals("P")) {
				plus += credit;
			}

			GPA += credit * grade_num;
		}

		GPA /= plus;

		System.out.printf("%.6f", GPA);
	}

}
