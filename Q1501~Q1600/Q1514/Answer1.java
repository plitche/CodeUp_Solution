package Q1514;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1514
//@Memory 11192, @Time 75

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 체스판의 크기 7*7 만큼 배열 선언
        int[][] numbers = new int[7][7];
        
        // 3개의 스플리터를 입력받기로 했음으로
        for (int i=0; i<3; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	int row = Integer.parseInt(st.nextToken());
        	int col = Integer.parseInt(st.nextToken());
        	numbers[row-1][col-1] = 2;
        }
        
        for (int i=0; i<7; i++) {
        	if (numbers[3][i]==2) {
        		for (int j=0; j<7; j++) {
        			if (numbers[j][i]==2) {
        				for (int k=0; k<7; k++) {
        					if (numbers [j][k] == 2) {
        						for (int p=0; p<7; p++) {
        							if (numbers[p][k] != 2) {
        								numbers[p][k] = 1;		
        							}
        						}
        					} else {
        						numbers[j][k] = 1;
        					}
        				}
        			} else {
        				numbers[j][i] = 1;
        			}
        		}
        	} else {
        		numbers[3][i] = 1;	
        	}
        	
        }
        
        for (int[] i : numbers) {
        	for (int j : i) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}