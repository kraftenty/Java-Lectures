import java.util.*;

public class my2_HashSet2 {

	public static void main(String[] args) {
		
		String[] arr = {"미고","도이","봉이"};
		Set<String> Sample = new HashSet<>();
		for(String a : arr)
			Sample.add(a);
		System.out.println("Sample 요소"+Sample);
		
		Set<String> Myset=new HashSet<>();
		Myset.add("미고");
		Myset.add("도이");
		Myset.add("봉이");
		Myset.add("봉이");
		
		System.out.println("Sample 요소의 코드"+Sample.hashCode());
		System.out.println("Myset 요소의 코드"+Myset.hashCode());
		
		System.out.println("두 객체가 같은지 여부="+(Sample==Myset));
		System.out.println("두 객체가 같은지 여부2="+Myset.equals(Sample));
	}

}
