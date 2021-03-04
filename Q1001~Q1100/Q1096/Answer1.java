package Q1096;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1096
//@Memory 14476, @Time 128

public class Answer1 {
	// 흰 돌이 올려진 바둑판의 상황을 출력한다. 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int stone = sc.nextInt();	// 바둑판에 놓인 돌의 개수
		
		int[][] location = new int[19][19];	// 바둑판 가로세로 길이
		for (int i=0; i<stone; i++) {
			int x = sc.nextInt()-1;	// 인덱스는 0부터 시작함으로 줄수 -1
			int y = sc.nextInt()-1;	// 인덱스는 0부터 시작함으로 줄수 -1
			
			location[x][y] = 1;	// 놓인 돌 위치의 배열 값을 1로 바꾸기
		}
		
		for (int i=0; i<location.length; i++) {
			for (int j=0; j<location.length; j++) {
				System.out.print(location[i][j] + " ");	//2중 포문을 사용하여 출력
			}
			System.out.println();	// inner 포문 종료 후 줄 띄우기
		}
	
		sc.close();
	}
}