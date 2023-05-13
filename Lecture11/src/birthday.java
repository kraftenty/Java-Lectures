import java.util.*;


public class birthday extends my2_banquet{
	private int cakesize;
	final int persize_cost = 2000;
	
	public birthday() {
		System.out.println("생일파티 예약");
	}
	
	public void calc_cake(String cakekind) {
		Map<String,Integer> cake = new HashMap<>();
		cake.put("루비", 15);
		cake.put("사파이어", 18);
		cake.put("다이아몬드", 21);
		cakesize = cake.get(cakekind);
	}
	 
	public long calcdeco_cost() { // 데코레이션 비용 계산
		int cake_cost;
		long cakedeco_cost;
		cake_cost = cakesize*persize_cost;
		cakedeco_cost = cake_cost + (people*deco_basic);
		System.out.println("케익테이블 데코레이션 기본비용===>" + cakedeco_cost);
		return cakedeco_cost;
	}
	public void calctot_cost() { // 총 비용 계산
		long tot = calcdeco_cost() + (perpeople_cost*people);
		if(people >= 15)
			tot+=30000;
		System.out.println("생일파티 총 예상비용(15명 이상이면 3만원 추가)===>" + tot);
	}

}
