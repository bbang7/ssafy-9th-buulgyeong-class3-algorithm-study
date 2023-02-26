

import java.util.Scanner;

public class P1343 {
	static String s;
	static String a = "AAAA";
	static String b = "BB";
	static int cnt;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == 'X') {
				++cnt;
			}
			else if(s.charAt(i)=='.') {
				if(check()) {
					sb.append('.');
				}
				else {
					System.out.println(-1);
					return;
				}
			}

		}
		boolean flag = check();
		if(check()) System.out.println(sb);
		else System.out.println(-1);

	}

	static boolean check() {
		while (cnt > 0) {
			if (cnt == 0)
				break;
			if (cnt % 2 != 0) {
				return false;
			}

			if (cnt >= 4) {
				sb.append(a);
				cnt -= 4;
			} else if (cnt >= 2) {
				sb.append(b);
				cnt -= 2;
			}

		}
		return true;
	}

}
