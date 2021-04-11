package Q1284;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1284
//@Memory 11164, @Time 75
class PrimeNumber {

    public boolean isPrimeNumber(int n) {
        if (n==2) {	// 2는 무조건 소수임으로 바로 return
            return true;
        } else if (n%2==0) {
            return false;
        }

        for (int i=3; i<n; i+=2) { // 2일때는 위에서 처리했음으로 3부터
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
public class Answer1 {
	//	어떤 수(n)가 입력되면 두 소수의 곱으로 나타낼 수 있으면 두 소수를 오름차순으로 출력하고, 그렇지 않으면 "wrong number"를 출력하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PrimeNumber pn = new PrimeNumber();
        String result="wrong number";
        
        for (int i=2; i<n; i++) {
            if (n%i==0) {	// 나누어 떨어질 때 소수인지 메소드 호풀을 통해 판단
                if (pn.isPrimeNumber(i)) {
                    int j = n/i;
                    if(pn.isPrimeNumber(j)) {
                        result = i+" "+j;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
	}
	
}