
interface Intogether { // 인터페이스
	
	public void info_cost(int type_info);
}

class mng_banquet {
	int inwon;
	protected int cost;
	
	public void info_prn() {
		System.out.println("가격정보= " + inwon*cost);
	}
}

class mng_birth extends mng_banquet implements Intogether {

	public void info_cost(int type_info) { // 상속받은 Intogether 인터페이스의 추상메소드 구
		if(type_info==1)
			cost = 9000;
		else if(type_info==2)
			cost = 15000;
	}

}



public class my2_interface {

	public static void main(String[] args) {
		
		mng_birth mybanquet = new mng_birth();
		mybanquet.inwon = 5;
		mybanquet.info_cost(2);
		mybanquet.info_prn();

	}

}
