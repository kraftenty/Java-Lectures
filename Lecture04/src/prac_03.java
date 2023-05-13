import java.util.Scanner;

public class prac_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("글자를 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("입력한 문자열 ==> " + str);
		
		System.out.print("변환된 문자열 ==> ");
		int str_cnt = str.length();
		for(int i=str_cnt-1; i>=0; i--)
			System.out.print(str.charAt(i));
		sc.close();
	}

}
