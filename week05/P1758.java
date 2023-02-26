import java.util.Arrays;
import java.util.Scanner;

public class P1758 {
	static int N;
	static long ans;
	static Integer[] cust;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		cust = new Integer[N];

		for (int i = 0; i < N; ++i) {
			cust[i] = sc.nextInt();
		}
		
		Arrays.sort(cust,(a,b)->b-a);
		
		for(int i=0;i<N;++i) {
			ans += (cust[i]-(i))<=0?0:cust[i]-(i);
		}
		
		System.out.println(ans);
		
	}
}
