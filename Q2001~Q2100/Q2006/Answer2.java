package Q2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2006
//@Memory 11144, @Time 62
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[M][N];

        for (int i=0; i<M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i=0; i<M; i++) {
            int count = 0;

            for (int j=0; j<N; j++) {
                for (int k=i; k<M; k++) {
                    if (arr[k][j] < arr[k][j+1]) {
                        count++;
                    } else {
                        count--;
                    }
                }

                if (count == -3 || count == 3) {
                    System.out.println(i + " : " + j);
                }
            }
        }

    }
    	 
}
