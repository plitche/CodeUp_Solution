package Q1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1099
//@Memory 11240, @Time 67

public class Answer2 {
	// 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다. 성실한 개미가 이동한 경로를 9로 표시해 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 미로의 크기 2차원 배열 길이 선언
        String[][] maze = new String[10][10];
        // 미로 만들기
        for (int i=0; i<10; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<10; j++) {
        		// 미로 갈 수 있는 곳(0), 벽 또는 장애물(1), 먹이(2) 입력받아 배열에 저장 
				maze[i][j] = st.nextToken();
        	}
        }
        
        int x = 1;	// 가로 위치 선언
        
		// 개미의 이동경로 9로 바꾸기
		for (int i=1; i<10; i++) {	// 개미의 첫 위치는 maze[1][1]
			// 먹이를 찾은 경우         or   마지막에 도착한 경우
			if (maze[x][i].equals("2")) { 
				maze[x][i] = "9";	// 이동 경로 9로 바꾸기
				break;	// for문 종료
			} else {	// 먹이를 못찾은 경우
				maze[x][i] = "9";	// 이동 경로 9로 바꾸기
				if (maze[x][i+1].equals("1")) {	// 다음 이동 경로가 장애물이 있으면
					if (x==8 && i==8) { //더이상 움직이지 못할 경우
						break;
					} else {
						x += 1;	// 세로로 1칸 이동
						i -= 1;	// 가로 한칸 전으로 이동
					}
				}
			}
		}
        StringBuilder sb = new StringBuilder();
        for (String[] i : maze) {	// 2중 foreach문 활용
        	for (String j : i) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }

}
