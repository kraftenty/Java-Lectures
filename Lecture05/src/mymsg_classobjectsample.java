import java.util.Date; //Date클래스 임포트

class Goods{
	//필드선언
	String irum;
	String import_date;
	//메소드
	void info_goods() {
		System.out.println("입고상품명=" + irum);
		System.out.println("입고일자=" + import_date);
	}
	
}

public class mymsg_classobjectsample {

	public static void main(String[] args) {
		
		Date today = new Date();
		Goods my_goods = new Goods();
		
		my_goods.irum="미백크림";
		my_goods.import_date=today.toString();
		my_goods.info_goods();
		
		Goods my2_goods = new Goods();
		my2_goods = my_goods; 
		my2_goods.info_goods(); //같은 곳을 참조하고 있기 때문에 동일한 값이 나온다.
	}

}
