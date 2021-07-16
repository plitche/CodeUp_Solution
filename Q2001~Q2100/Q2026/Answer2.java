package Q2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2026
//@Memory 14188, @Time 88
class Binary {
	private String hex;
	private String[] hex2bin = {"0000", "0001", "0010", "0011","0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
	
	public Binary(String number) {
		hex = number;
	}
	
	public void hexTobin() {
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<hex.length(); i++) {
			switch(hex.charAt(i)) {
			case '0' : result.append(hex2bin[0]); break;
			case '1' : result.append(hex2bin[1]); break;
			case '2' : result.append(hex2bin[2]); break;
			case '3' : result.append(hex2bin[3]); break;
			case '4' : result.append(hex2bin[4]); break;
			case '5' : result.append(hex2bin[5]); break;
			case '6' : result.append(hex2bin[6]); break;
			case '7' : result.append(hex2bin[7]); break;
			case '8' : result.append(hex2bin[8]); break;
			case '9' : result.append(hex2bin[9]); break;
			case 'A' : result.append(hex2bin[10]); break;
			case 'B' : result.append(hex2bin[11]); break;
			case 'C' : result.append(hex2bin[12]); break;
			case 'D' : result.append(hex2bin[13]); break;
			case 'E' : result.append(hex2bin[14]); break;
			case 'F' : result.append(hex2bin[15]); break;
			}
			
			result.append(" ");
		}
		
		System.out.println(result);
	}
}
public class Answer2 {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        Binary binary = new Binary(number);
        binary.hexTobin();
        
	}
}
 