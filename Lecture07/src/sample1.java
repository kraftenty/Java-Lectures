class hello{
	public hello() { //클래스 이름과 똑같으면 생성자.
		System.out.println("생성자 부분입니다");
	}
	public void prn_1() {
		System.out.println("연습입니다");
	}
}
public class sample1 {

	public static void main(String[] args) {
		
		hello myhello = new hello();
		myhello.prn_1();

	}

}
