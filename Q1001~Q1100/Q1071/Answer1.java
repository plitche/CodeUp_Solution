// URL : https://www.codeup.kr/problem.php?id=1071
// 풀이 : Scanner
// 메모리 : 12468, 시간 97

package Q1071;

import java.util.Scanner;

public class Answer1 {

	private static Scanner sc = new Scanner(System.in);

	public static void printNotZero(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n);
			n = sc.nextInt();
			printNotZero(n);
		}
	}

	public static void main(String[] args) {
		printNotZero(sc.nextInt());
		sc.close();
	}
}
