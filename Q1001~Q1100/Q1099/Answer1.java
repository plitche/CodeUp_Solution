package Q1099;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1099
//@Memory 14512, @Time 122

public class Answer1 {
	// 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다. 성실한 개미가 이동한 경로를 9로 표시해 출력한다.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] maze = new int[10][10];	// 미로의 크기 2차원 배열 길이 선언
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				// 미로 갈 수 있는 곳(0), 벽 또는 장애물(1), 먹이(2) 입력받아 배열에 저장 
				maze[i][j] = sc.nextInt();
			}
		}
		
		int position = 1;
		
		// 개미의 이동경로 9로 바꾸기
		for (int j=1; j<10; j++) {	// 개미의 첫 위치는 maze[1][1]
					// 먹이를 찾은 경우         or   마지막에 도착한 경우
			if (maze[position][j]==2 || (position==8 && j==8)) { 
				maze[position][j] = 9;	// 이동 경로 9로 바꾸기
				break;	// for문 종료
			} else {	// 먹이를 못찾은 경우
				maze[position][j] = 9;	// 이동 경로 9로 바꾸기
				if (maze[position][j+1]==1) {	// 다음 이동 경로가 장애물이 있으면
					position += 1;	// 세로로 1칸 이동
					j -= 1;	// 가로 한칸 전으로 이동
				}
			}
		}
		
		// 개미 이동경로 출력하기
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}