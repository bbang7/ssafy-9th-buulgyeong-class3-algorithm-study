import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class P2217 {
static int [] rope;
static int [] weight;
static int N,ans;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N=sc.nextInt();
	rope = new int [N];
	weight =new int [N];
	int  cnt =N;
	for(int i=0;i<N;++i) {
		rope[i] = sc.nextInt();
	}
	
	Arrays.sort(rope);
	
	for(int i=0;i<N;++i) {
		weight[i] = cnt*rope[i];
		cnt--;
	}
	
	for (int  i : weight) {
		ans = Math.max(ans, i);
	}
	System.out.println(ans);
	
	
	
}
}
