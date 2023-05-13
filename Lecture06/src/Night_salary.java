

public class Night_salary extends Basic_salary{
	long danger_pay = 50000;
	long special_pay = 17000;
	
	//day_pay 메소드 오버라이딩
	public void day_pay() {
		long night_tot = danger_pay + special_pay;
		System.out.println("야간수당포함 총 일급여액 = " + (night_tot+(work_time*work_pay)));
	}
	
//	public void night_work() {
//		super.day_pay();
//		System.out.println("야간 총 일 급여액 = " + (danger_pay+special_pay));
//	}
}
