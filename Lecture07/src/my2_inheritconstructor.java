// 상속에서의 생성자

class super_sample {
	// 필드
	private String irum;
	
	// 생성자 (오버로딩)
	public super_sample() {
		System.out.println("여기는 슈퍼클래스입니다.");
	}
	public super_sample(String irum) {
		this.irum = irum;
		System.out.println(irum + "님 안녕하세요");
	}
	
	// 메소드
	public void roan_info(String place_in) {
		if(place_in=="서울강남3구" || place_in=="세종" || place_in=="과천")
			System.out.println("투기과열지구지역");
		else
			System.out.println(irum + "님의 지역은 일반지역입니다");
			
	}
}

class child_sample extends super_sample {
	
	// 생성자 (오버로딩)
	public child_sample() {
		//super(); //컴파일러가 자동으로 넣어줌.
		System.out.println("여기는 서브클래스입니다.");
	}
	public child_sample(String irum) {
		super(irum); // super를 이용해서 argument값을 슈퍼클래스로 넘겨줘야함.
		System.out.println("여기는 서브클래스입니다.");
	}
}

public class my2_inheritconstructor {

	public static void main(String[] args) {

		child_sample mychild = new child_sample();
		mychild.roan_info("세종");
		
		child_sample mychild1 = new child_sample("홍길동");
		mychild1.roan_info("강원");
	}

}
