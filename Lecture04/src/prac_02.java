import java.util.Scanner;

public class prac_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		
		int i=0;
		int upper_cnt=0, lower_cnt=0, digit_cnt=0;
		do {
			char ch = str.charAt(i);
			if('A'<=ch && ch<='Z')
				upper_cnt++;
			if('a'<=ch && ch<='z')
				lower_cnt++;
			if('0'<=ch && ch<='9')
				digit_cnt++;
			i++;
		} while(i<str.length());
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n", upper_cnt, lower_cnt, digit_cnt);
		sc.close();
	}

}
