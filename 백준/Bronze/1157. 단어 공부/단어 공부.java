import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[26];
		String R = in.next().toUpperCase();
		
		for(int i = 0; i < R.length(); i++) {
			int num = R.charAt(i) - 'A';
			arr[num]++;
		}
		
		int max = 0;
		char answer = '?';
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				answer = (char)(i + 'A');
			} else if(max == arr[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
		in.close();
	}
	
}