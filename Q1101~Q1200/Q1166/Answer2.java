package Q1166;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1166
//@Memory 11164, @Time 66

public class Answer2 {
	// 2월이 29일까지 있는 해를 윤년이라고 한다. 어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.
	// 윤년 판단 조건)
	// 1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
	// 2. 400의 배수이면 윤년.
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine()); 
        // 4의 배수이면서 100의 배수가 아니거나, 400의 배수일 때 (둘 중 하나라도 해당되면)
        System.out.print( (year%4==0 && year%100!=0) || (year%400==0) ? "yes" : "no" );
    }

}