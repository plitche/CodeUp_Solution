package Q1098;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1098
//@Memory 14460, @Time 111

public class Answer1 {
	// 모든 막대를 놓은 격자판의 상태를 출력한다. 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다. 단,각 숫자는 공백으로 구분하여 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();	// 격자판 가로 길이
		int h = sc.nextInt();	// 격자판 세로 길이
		
		int[][] board = new int[w][h];	// 입력받은 격자판 크기만큼 배열 크기 지정
		
		int n = sc.nextInt();	// 막대의 개수
		// 막대의 속성 막대의 개수만큼 배열 길이 지정
		int[] i = new int[n];	
		int[] d = new int[n];	
		int[] x = new int[n];	
		int[] y = new int[n];	
		
		for (int j=0; j<n; j++) {	// 막대의 개수만큼 for문 반복
			i[j] = sc.nextInt();	// 막대의 길이
			d[j] = sc.nextInt();	// 막대의 방향
			x[j] = sc.nextInt()-1;	// 가로 좌표
			y[j] = sc.nextInt()-1;	// 세로 좌표
		}
		
		for (int j=0; j<n; j++) {	// 막대의 개수만큼 for문 반복
			for (int k=0; k<i[j]; k++) {	//막대의 길이만큼 for문 반복
				if (d[j]==0) {	// 막대를 놓는 방향이 가로일 때
					board[x[j]][y[j]+k] = 1;
				} else {	// 막대를 놓는 방향이 세로일 때
					board[x[j]+k][y[j]] = 1;
				}
			}
		}
		
		for (int j=0; j<w; j++) {
			for (int k=0; k<h; k++) {
				System.out.print(board[j][k] + " ");	// 해당 격자판 값 출력
			}
			System.out.println();	// 줄 바꿈
		}
		sc.close();
	}
}