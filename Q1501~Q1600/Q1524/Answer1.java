package Q1524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1526
//@Memory 11248, @Time 68
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 지뢰판 9*9 크기를 배열로 지정한다.
        int[][] mine = new int[9][9];
        
        // 지뢰가 있는 위치를 입력받는다.
        for (int i=0; i<9; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<9; j++) {
        		mine[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        // 내가 선택할 지뢰 위치를 입력받는다.
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st1.nextToken());
        int y = Integer.parseInt(st1.nextToken());
        
        // 지뢰 개수
        int count = 0;
        if (mine[x-1][y-1] == 1) {	// 내가 선택한 위치가 지뢰가 있다면
        	count = -1;
        } else {
        	int startX;
        	int endX;
        	int startY;
        	int endY;
        	
        	if (x<2) {
        		startX = 0;
        		endX = 1;
        	} else if (x>8) {
        		startX = 7;
        		endX = 8;
        	} else {
        		startX = x-2;
        		endX = x;
        	}
        	
        	if (y<2) {
        		startY = 0;
        		endY = 1;
        	} else if (y>8) {
        		startY = 7;
        		endY = 8;
        	} else {
        		startY = y-2;
        		endY = y;
        	}
        	
        	for (int i=startX; i<=endX; i++) {
        		for (int j=startY; j<=endY; j++) {
        			if (mine[i][j]==1) {
        				count++;
        			}
        		}
        	}
        }
        
        System.out.println(count);
        br.close();
    }
    
}