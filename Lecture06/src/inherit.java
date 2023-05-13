
//Basic_salary와 Night_salary를 이용하는 메인 클래스
public class inherit {

	public static void main(String[] args) {
		Night_salary n_work = new Night_salary();
		n_work.work_time = 7;
		n_work.work_pay = 13000;

		n_work.day_pay(); //자식 클래스의 day_pay 메소드 호출
	}

}
