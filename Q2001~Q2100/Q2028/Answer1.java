package Q2028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2028
//@Memory 11292, @Time 249
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); // 넘어야 하는 약수의 개수 입력 받기

        int index=1; // 
        int number=0;
        while(true) {
        	number += index;
        	int many = 0;
        	for (int i=1; i<=number; i++) {
        		if (number%i==0) {
        			if (i > (number/i)) break; // 나눈 몫이 본인보다 더 커지는 순간 break;
        			
        			if ((number/i) == i) {
        				many += 1;	// 동일 수의 제곱일 때는 +1
        			} else {
        				many += 2;  // 서로 다른수의 곱 일때는 +2
        			}
        			
    			}
    		}

        	if (count<many) {
        		System.out.println(number); // 입력받은 약수의 개수보다 많아질때 break;
        		break;
        	} else {
        		index++;
        	}
        }

	}
}
 