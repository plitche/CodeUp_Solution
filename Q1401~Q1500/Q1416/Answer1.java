package Q1416;

import java.io.IOException;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1416
//@Memory 12484, @Time 97

public class Answer1 {
	//	어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tens = sc.nextInt();
        int two=1;
        int times=1;
        while (tens/two>1) {
            two*=2;
            times+=1;
        }
        for (int i=0; i<times; i++) {
            if (tens>=two) {
                sb.append(1);
                tens-=two;
            } else sb.append(0);
            two /= 2;
        }
        System.out.println(sb);
        sc.close();
    }
    	 
}