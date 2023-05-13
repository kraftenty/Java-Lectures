
public abstract class my2_banquet{
	public my2_banquet(){
		System.out.println("연회전문 예약 원클릭서비스");
		
	}
	
	protected int people; // 인원
	final int perpeople_cost = 50000; // 인당 기본 비용
	final int deco_basic = 3000; // 인당 테이블 데코레이션 비용
	
	public void set_people(int people) {
		this.people = people;
	}
	public abstract long calcdeco_cost(); // 데코레이션 비용 계산
	public abstract void calctot_cost(); // 총 비용 계산
} 