package Q1445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1445
//@Memory 12104, @Time 89

public class Answer1 {
	//	두 배열을 합쳐서 오름차순 정렬된 배열을 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        
        // 첫줄에 입력된 숫자만큼 배열의 크기 선언
        int[] a = new int[Integer.parseInt(st1.nextToken())];
        int[] b = new int[Integer.parseInt(st1.nextToken())];

        // 배열에 저장할 숫자들
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<a.length; i++) {
        	a[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i=0; i<b.length; i++) {
        	b[i] = Integer.parseInt(st3.nextToken());
        }
        
        for (int i=0; i<a.length; i++) {
        	for (int j=0; j<b.length; j++) {
    			if (a[i] > b[j]) {
            		if (b[j]!=0) {
        				sb.append(b[j]).append(" ");
        				b[j] = 0;
            		}
    			} else {
    				sb.append(a[i]).append(" ");
    				a[i] = 0;
    				break;
    			}
        	}
        }
        
        for (int i=0; i<a.length; i++) {
        	if (a[i] != 0 ) {
        		sb.append(a[i]).append(" ");
        	}
        }
        for (int i=0; i<b.length; i++) {
        	if (b[i] != 0 ) {
        		sb.append(b[i]).append(" ");
        	}
        }

        System.out.println(sb);
        br.close();
    }
    	 
}