class MakeGeneric<T>{ //E와 T 둘다 가능
	private T object;
	public void makeget() {
		System.out.println("전달받은 값="+this.object);
	}
	public void makeset(T object) {
		this.object = object;
	}
}


public class my2_genericsample {

	public static void main(String[] args) {
		
		MakeGeneric<String> mygeneric = new MakeGeneric<>();
		mygeneric.makeset("홍길동");
		mygeneric.makeget();
	}

}
