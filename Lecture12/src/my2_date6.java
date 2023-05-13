import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class my2_date6 {

	public static void main(String[] args) {
		
		int y,m,d;
		System.out.println("년도 입력");
		Scanner sc1 = new Scanner(System.in);
		y = sc1.nextInt();
		System.out.println("월 입력");
		Scanner sc2 = new Scanner(System.in);
		m = sc2.nextInt();
		System.out.println("일 입력");
		Scanner sc3 = new Scanner(System.in);
		d = sc3.nextInt();
		sc1.close(); sc2.close(); sc3.close();
		
		LocalDate mydate = LocalDate.now();
		LocalDate yourdate = LocalDate.of(y, m, d);
		
		//Period until메소드를 이용한 날짜 차이 계산
		//Period p = mydate.until(yourdate);
		
		//Period between메소드를 이용한 날짜 차이 계산
		Period p = Period.between(mydate, yourdate);
		
		//출력
		System.out.println("년도차이 : " + p.getYears() + "년");
		System.out.println("개월차이 : " + p.getMonths() + "월");
		System.out.println("일 차이 : " + p.getDays() + "일");
	}

}
