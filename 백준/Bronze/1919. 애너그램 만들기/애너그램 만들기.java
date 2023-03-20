import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int[] a_count = new int[26];
        int[] b_count = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            a_count[a.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < b.length(); i++) {
            b_count[b.charAt(i) - 'a']++;
        }
        
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (a_count[i] > b_count[i]) {
                ans += a_count[i] - b_count[i];
            } else if (a_count[i] < b_count[i]) {
                ans += b_count[i] - a_count[i];
            }
        }
        
        System.out.println(ans);
    }
}