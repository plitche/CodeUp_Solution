package Q1180;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1180
//@Memory 11124, @Time 68

public class Answer1 {
	// 민호는 발명을 되게 좋아하고, 컴퓨터 프로그램도 되게 좋아한다.
	// 어느 날 민호는 컴퓨터를 사용하던 중 휴지통이 꽉 차서 불편을 느꼈다.
	// 그래서 휴지통이 n만큼 차면 알아서 쓰레기를 압축해주는 휴지통을 만들려고 한다.
	// 이 때 압축하는 알고리즘은 다음과 같다. = 10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.
	// 예) 70일 경우 14가 된다.( 70 -> 07 -> 14 )
	// 이 알고리즘은 때로는 부작용을 일으켜 휴지통의 내용이 더 많아 질지도 모른다.
	// 만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int tens = 0;
        int units =0;

        // 아스키코드를 사용하여 0만큼 빼준다.
        if (n.length()==1) {
            units = n.charAt(0)-'0';
        } else {
            tens = n.charAt(0)-'0';
            units = n.charAt(1)-'0';
        }

        // 결과 = 자리수에 맞게 나온 값*2%100;
        int result = (units*10+tens)*2%100;
        System.out.println(result);
        // 3항 연산자 이용
        System.out.println(result<=50 ? "GOOD" : "OH MY GOD");
	}

}
