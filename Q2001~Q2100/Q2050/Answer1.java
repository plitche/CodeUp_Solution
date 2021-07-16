package Q2050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2050
//@Memory 11204, @Time 68
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String direction = br.readLine();
        StringTokenizer st;
        
        int[][] arr = new int[4][4];
        for (int i=0; i<4; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		arr[i][j]+=Integer.parseInt(st.nextToken());
        	}
        }
        
        if (direction.equals("U")) {
        	for (int k=0; k<3; k++) {
        		for (int i=0; i<4; i++) {
                	for (int j=0; j<4; j++) {
            			if (arr[i][j]==0 && i<3) {
            				arr[i][j] = arr[i+1][j];
            				arr[i+1][j] = 0;
            			}
                	}
                }
                for (int i=0; i<4; i++) {
                	for (int j=0; j<4; j++) {
                        if (i<3) {
                			if (arr[i][j] == arr[i+1][j]) {
                				arr[i][j] = arr[i][j]+arr[i+1][j];
                				arr[i+1][j] = 0;
                			}
                		}
                	}
                }
        	}
        } else if(direction.equals("D")) {
        	for (int k=0; k<3; k++) {
        		for (int i=3; i>=0; i--) {
                	for (int j=0; j<4; j++) {
            			if (arr[i][j]==0 && i>0) {
            				arr[i][j] = arr[i-1][j];
            				arr[i-1][j] = 0;
            			}
                	}
                }
                for (int i=3; i>=0; i--) {
                	for (int j=0; j<4; j++) {
                        if (i>0) {
                			if (arr[i][j] == arr[i-1][j]) {
                				arr[i][j] = arr[i][j]+arr[i-1][j];
                				arr[i-1][j] = 0;
                			}
                		}
                	}
                }
        	}
        } else if(direction.equals("L")) {
        	for (int k=0; k<3; k++) {
        		for (int i=0; i<4; i++) {
                	for (int j=0; j<4; j++) {
            			if (arr[i][j]==0 && j<3) {
            				arr[i][j] = arr[i][j+1];
            				arr[i][j+1] = 0;
            			}
                	}
                }
                for (int i=0; i<4; i++) {
                	for (int j=0; j<4; j++) {
                        if (j<3) {
                			if (arr[i][j] == arr[i][j+1]) {
                				arr[i][j] = arr[i][j]+arr[i][j+1];
                				arr[i][j+1] = 0;
                			}
                		}
                	}
                }
        	}
        } else {
        	for (int k=0; k<3; k++) {
        		for (int i=0; i<4; i++) {
                	for (int j=3; j>=0; j--) {
            			if (arr[i][j]==0 && j>0) {
            				arr[i][j] = arr[i][j-1];
            				arr[i][j-1] = 0;
            			}
                	}
                }
                for (int i=0; i<4; i++) {
                	for (int j=3; j>=0; j--) {
                        if (j>0) {
                			if (arr[i][j] == arr[i][j-1]) {
                				arr[i][j] = arr[i][j]+arr[i][j-1];
                				arr[i][j-1] = 0;
                			}
                		}
                	}
                }
        	}
        }
        for (int[] i : arr) { for (int j : i) { sb.append(j + " "); } sb.append("\n"); }
    	System.out.println(sb);	
	}
}