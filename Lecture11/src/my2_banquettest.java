import java.util.Scanner;

public class my2_banquettest {

	public static void main(String[] args) {
		
		int gubun, person;
		String cakekind;
		System.out.println("예약하실 연회의 종류를 입력하세요.(1.워크샵/세미나, 2.생일파티/기념)");
		Scanner sc1 = new Scanner(System.in);
		gubun = sc1.nextInt();
		
		System.out.println("모임인원을 입력하세요.");
		Scanner sc2 = new Scanner(System.in);
		person = sc2.nextInt();
		
		if(gubun==1) {
			workshop myworkshop = new workshop();
			myworkshop.set_people(person);
			myworkshop.calctot_cost();
			
		} else if(gubun==2) {
			System.out.println("생일에 사용하실 케익의 종류를 입력하세요.(루비/사파이어/다이아몬드)");
			Scanner sc3 = new Scanner(System.in);
			cakekind = sc3.next();
			birthday mybirthday = new birthday();
			mybirthday.set_people(person);
			mybirthday.calc_cake(cakekind);
			mybirthday.calctot_cost();
		}
		
	}
}
