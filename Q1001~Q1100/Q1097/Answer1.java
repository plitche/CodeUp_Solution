package Q1097;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1097
//@Memory 14908, @Time 131

public class Answer1 {
	// 십자 뒤집기 결과를 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] location = new int[19][19];	// 바둑판 가로세로 길이
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				// 바둑알이 놓인 자리에 흰 돌(1), 검은 돌(0)을 입력받아 저장한다.
				location[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt(); // 뒤집을 횟수
		int[] x = new int[n]; // 뒤집을 횟수만큼 배열 길이선언 (가로)
		int[] y = new int[n]; // 뒤집을 횟수만큼 배열 길이선언 (세로)
		
		for (int i=0; i<n; i++) { // 뒤집기 횟수만큼 for문 반복
			x[i] = sc.nextInt()-1; //뒤집을 좌표(가로) 저장
			y[i] = sc.nextInt()-1; //뒤집을 좌표(세로) 저장
		}
		
		// 바둑알 뒤집기
		for (int i=0; i<n; i++) { // 뒤집을 횟수만큼 for문 반복
			for (int j=0; j<19; j++) { //해당 줄 모두 뒤집기 위해서
				// x좌표 고정에 y줄 뒤집기
				if(location[x[i]][j]==0) {	// 기존이 검은돌이면
					location[x[i]][j] = 1;	// 흰돌로 뒤집기
				} else {		
					location[x[i]][j] = 0;	// 검은돌로 뒤집기
				}
				
				// y좌표 고정에 x줄 뒤집기				
				if(location[j][y[i]]==0) {
					location[j][y[i]] = 1;
				} else {
					location[j][y[i]] = 0;
				}
			}
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