import java.util.*;

public class my2_HashSet1 {

	public static void main(String[] args) {
		
		Set<String> Myset = new HashSet<>(); //순서가 없고, 중복 없음.
		Myset.add("미고");
		Myset.add("도이");
		Myset.add("봉이");
		Myset.add("봉이");
		System.out.println("항목="+Myset); 
		System.out.println("원소 갯수="+Myset.size());
		//Myset.remove("도이");
		//System.out.println("항목="+Myset);
		if(Myset.contains("도이")==true)
			System.out.println("도이는 존재하는 항목입니다.");
		
	}

}
