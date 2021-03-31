package Q1214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1214
//@Memory 11224, @Time 92

public class Answer1 {
	//  연도와 월을 알고 있을 때 그 달의 마지막 날을 구하는 프로그램을 작성하시오.
	//	- 조건 1 : 400의 배수인 해는 모두 윤년이다.
	//  - 조건 2 : 4의 배수인 해들 중 100의 배수가 아닌 해들은 모두 윤년이다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());

        // 만약 월이 2월이면
        if (month==2) {
        	// 그 해가 윤년이라면
        	if ( (year%400==0) || (year%4==0 && year%100!=0) ) {
        		sb.append("29");	// 29일이다.
            } else {
            	sb.append("28");
            }
        } else {
        	switch(month) {
        	case 1 : sb.append("31"); break;
        	case 3 : sb.append("31"); break;
        	case 4 : sb.append("30"); break;
        	case 5 : sb.append("31"); break;
        	case 6 : sb.append("30"); break;
        	case 7 : sb.append("31"); break;
        	case 8 : sb.append("31"); break;
        	case 9 : sb.append("30"); break;
        	case 10 : sb.append("31"); break;
        	case 11 : sb.append("30"); break;
        	case 12 : sb.append("31"); break;
        	}
        }
     
        System.out.println(sb);
        br.close();
	}

}
