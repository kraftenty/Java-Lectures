import java.util.StringJoiner;

public class my2_string4 {

	public static void main(String[] args) {
		
		// delimiter, prefix, suffix
		StringJoiner sj = new StringJoiner("/","(",")").add("사과").add("복숭아").add("딸기");
//		sj.add("사과");
//		sj.add("복숭아");
//		sj.add("딸기");
//		String result = sj.toString();
		String result = new StringJoiner("/","(",")").add("사과").add("복숭아").add("딸기").toString();
		System.out.println("결과====>"+result);
	}

}
