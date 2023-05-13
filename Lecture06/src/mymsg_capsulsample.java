
import java.util.Scanner;

class Exchange_currency {
	//필드 선언
	long kor_cache; // 환전할 금액
	private int ex_cache; // 환율 정보 
	private double ex_perrate; // 수수료
	private String irum; // 달러,엔,유로 단위
	
	// 환율 수수료 계산 메소드
	void calc_currency(int ex_kind) {
		double con_rate = 0.0;
		int result = 0;
		switch(ex_kind) {
		case 1:
			con_rate = 0.0187;
			break;
		case 2:
			con_rate = 0.017;
			break;
		case 3:
			con_rate = 0.09;
			break;
		}
		result = info_currency(ex_kind);
		ex_perrate = result*con_rate;
		calc_irum(ex_kind);
	}
	// 환율을 계산하여 리턴하는 메소드
	private int info_currency(int ex_kind) {
		int kind = 0;
		switch(ex_kind) {
		case 1:
			kind = 1142;
			break;
		case 2:
			kind = 1026;
			break;
		case 3:
			kind = 1336;
			break;
		}
		ex_cache = kind;
		return kind;
	}
	void calc_irum(int ex_kind) {
		switch(ex_kind) {
		case 1:
			irum = "달러";
			break;
		case 2:
			irum = "엔";
			break;
		case 3:
			irum = "유로";
			break;
		}
	}
	
	// 출력 결과를 표시하는 메소드
	void calc_result() {
		long pay_cache;
		pay_cache = kor_cache / ex_cache;
		System.out.println("현찰 금액 " + kor_cache + "원");
		System.out.println("총 환전금액 " + pay_cache + irum);
		System.out.println("총 환전수수료 " + (pay_cache*ex_perrate));
	}
}


public class mymsg_capsulsample {

	public static void main(String[] args) {

		int num = 0;
		long my_cache = 0;
		System.out.print("환전할 번호를 입력하세요.(1-us달러, 2-엔화, 3-유로) ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print("환전할 금액을 입력하세요. ");
		Scanner sc1 = new Scanner(System.in);
		my_cache = sc1.nextLong();
		sc.close();
		sc1.close();
		
		Exchange_currency my_currency = new Exchange_currency();
		my_currency.kor_cache = my_cache;
		my_currency.calc_currency(num);
		my_currency.calc_result();
	}

}
