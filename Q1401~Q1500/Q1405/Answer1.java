package Q1405;

import java.io.IOException;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1405
//@Memory 13876, @Time 110

public class Answer1 {
	//	n개의 숫자가 입력되면,
	//	n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb.append(num[j]).append(" ");
            }
            sb.append("\n");

            int temp;
            temp=num[0];
            for (int j=1; j<n; j++) {
                num[j-1]=num[j];
            }
            num[n-1]=temp;
        }
        System.out.println(sb);
        sc.close();
    }
	
}