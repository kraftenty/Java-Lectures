class Mycoffee{
	String irum;
	int price;
	
	void prn_info(String irum, int price) {
		System.out.println("입력한 커피="+irum);
		System.out.println("가격="+price);
	}
}

public class mymsg_classsample {

	public static void main(String[] args) {

		Mycoffee my1 = new Mycoffee();
		my1.prn_info("예가체프", 5500);
		
		Mycoffee my2 = new Mycoffee();
		my2.irum="아라비카";
		my2.price=7700;
		my2.prn_info(my2.irum, my2.price);

	}

}
