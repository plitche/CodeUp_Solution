package Q1080;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1080
//@Memory 14304, @Time 111

public class Answer1 {
	// 1, 2, 3 ... 을 계속 더해 나갈 때, 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		
		int countNum = 1;
		while(maxNum > 0) {
			maxNum -= countNum;
			countNum+=1;
		}
		
		System.out.println(countNum-1);
		sc.close();
	}
}

