package Q2030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2030
//@Memory 11276, @Time 65
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        char[][] window = new char[30][60]; // 윈도우 바탕화면 크기 2차원 배열로 초기화

    	for (int i=0; i<60; i++) {
    		for (int j=0; j<30; j++) {
				window[j][i] = '.'; // 모든 인덱스의 값을 .으로 넣어 놓기
			}
    	}
        
        for (int i=0; i<count; i++) { // 열려있는 창의 개수만큼 for문 반복
        	st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	int leftX = Integer.parseInt(st.nextToken()); // 좌표 입력 받기
        	int leftY = Integer.parseInt(st.nextToken());
        	int rightX = Integer.parseInt(st.nextToken());
        	int rightY = Integer.parseInt(st.nextToken());
        	
        	for (int j=leftX-1; j<rightX; j++) { // 해당 좌표의 index 자리에 맞추어 |나 - 혹은 공백 저장
        		for (int k=leftY-1; k<rightY; k++) {
        			if ( j==leftX-1 || j==rightX-1 ) {
        				window[k][j] = '|';
        			} else if (k==leftY-1 || k==rightY-1) {
        				window[k][j] = '-';
        			} else {
        				window[k][j] = ' ';
        			}
    			}
        	}
        	
        	window[leftY-1][leftX-1] = '+'; // 각 모서리 부분 +로 저장
        	window[leftY-1][rightX-1] = '+';
        	window[rightY-1][leftX-1] = '+';
        	window[rightY-1][rightX-1] = '+';
        	
        	for (int j=0; j<name.length(); j++) {
        		if (j < rightX-leftX-1) { // charAt을 이용하여 창 이름 입력
        			window[leftY-1][leftX+j] = name.charAt(j);
        		} else {
        			
        		}
        	}
        	
        }
        // for each문을 이용한 출쳑
        for (char i[] : window) {
        	for (char j : i) {
        		sb.append(j);
        	}
        	sb.append("\n");
        }

        System.out.println(sb);
	}
}
 