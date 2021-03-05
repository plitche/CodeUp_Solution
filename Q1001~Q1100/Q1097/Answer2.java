package Q1097;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1097
//@Memory 11316, @Time 77

public class Answer2 {
	// 십자 뒤집기 결과를 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[][] location = new int[20][20];	// 바둑판 가로세로 길이
        
		for (int i=1; i<20; i++) {
			// 한 줄 씩 입력받기
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=1; j<20; j++) {
				// 바둑알이 놓인 자리에 흰 돌(1), 검은 돌(0)을 입력받아 저장한다.
				location[i][j] = Integer.parseInt(st.nextToken());
			}
		}
        
		int n = Integer.parseInt(br.readLine()); // 뒤집을 횟수
		
		for (int i=0; i<n; i++) { // 뒤집기 횟수만큼 for문 반복
			// 뒤집을 좌표 저장하기
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()); //뒤집을 좌표(가로) 저장
			int y = Integer.parseInt(st.nextToken()); //뒤집을 좌표(세로) 저장
			
			for (int j=1; j<20; j++) {
				// x좌표 고정에 y줄 뒤집기
				if(location[x][j]==0) {	// 기존이 검은돌이면
					location[x][j] = 1;	// 흰돌로 뒤집기
				} else {		
					location[x][j] = 0;	// 검은돌로 뒤집기
				}
				
				// y좌표 고정에 x줄 뒤집기				
				if(location[j][y]==0) {
					location[j][y] = 1;
				} else {
					location[j][y] = 0;
				}
			}
		}
		
        for (int i=1; i<20; i++) {
        	for (int j=1; j<20; j++) {
        		sb.append(location[i][j]).append(" "); //2중 포문을 사용하여 sb에 저장
        	}
        	sb.append("\n");	// 줄 바꿈
        }
        
        System.out.println(sb);
        br.close();
    }

}
