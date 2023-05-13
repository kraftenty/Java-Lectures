// 생성자 사용 예제

class info_sample{
	// 필드
	private int cost;
	private int people;
	
	// 생성자 (오버로딩)
	public info_sample(int a, int b) {
		System.out.println("입력한 정보로 세팅합니다.");
		cost = a;
		people = b;
	}
	public info_sample() {
		System.out.println("가격 freeday!!");
	}
	
	// 메소드
	public void prn_calc() {
		System.out.printf("1인당 가격=%d 전체가격=%d \n", cost, cost*people);
	}
}

public class my2_constructorsample {

	public static void main(String[] args) {

		info_sample mycost = new info_sample(5000, 2);
		mycost.prn_calc();
		
		info_sample mycost1 = new info_sample();
		mycost1.prn_calc();
		
	}

}
