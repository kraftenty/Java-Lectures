import java.util.*;

public class my2_date3 {

	public static void main(String[] args) {
		
		int y,m,d,h;
		Calendar cal = Calendar.getInstance();
		y = cal.get(cal.YEAR);
		m = cal.get(cal.MONTH);
		d = cal.get(cal.DATE);
		h = cal.get(cal.HOUR_OF_DAY);
		System.out.println("현재년도==>" + y + "년" + (m+1) + "월" + d + "일" + h + "시");
	}

}
