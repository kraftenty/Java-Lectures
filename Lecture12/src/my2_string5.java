import java.util.*;

public class my2_string5 {

	public static void main(String[] args) {
		//기본 join
//		String join1 = String.join(",", "아메리카노","카페라떼","카페모카");
//		System.out.println("결과====>"+join1);
		
		//배열에서 join메소드
//		String[] arr = {"아메리카노","카페라떼","카페모카"};
//		String coffee = String.join("/", arr);
//		System.out.println("결과====>"+coffee);
		
		//List에서 join메소드
		List<String> arr = Arrays.asList("아메리카노","카페라떼","카페모카");
		String coffee = String.join("*", arr);
		System.out.println("결과====>"+coffee);
	}

}
