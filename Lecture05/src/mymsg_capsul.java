class Inbody_info{
	int age;
	String irum;
	private int height;
	private double weight;
	
	void info_all(int a, double b) {
		height = a;
		weight = b;
	}
}

public class mymsg_capsul {
	
	public static void main(String[] args) {
		
		Inbody_info my_inbody = new Inbody_info();
		my_inbody.age = 30;
		my_inbody.irum = "홍길동";
		//my_inbody.height = 170; private 필드에 직접 접근 불가 (에러발생)
		
		my_inbody.info_all(180, 63.5);
	}
}
