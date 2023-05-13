import java.util.*;

public class my2_arraylist2 {

	public static void main(String[] args) {
		
		// String형 배열을 ArrayList로 변경하는 방법
//		String[] arr = new String[] {"채송화", "금잔화","다알리아"};
//		List<String> Myflower = new ArrayList<>(Arrays.asList(arr)); // 일반 배열을 ArrayList로 변경
//		System.out.println("리스트 변환 결과" + Myflower);
//	
//		Myflower.set(2, "패랭이꽃");
//		Myflower.add(0, "마가렛트");
//		System.out.println("수정 후 리스트 변환 결과" + Myflower);
		
		
		// int형 배열을 ArrayList로 변경하는 방법.
		int arr[] = {100, 200, 300, 400};
		List<Integer> Mynum = new ArrayList<>();
		for(int a : arr)
			Mynum.add(a);
		Mynum.add(2, 250);
		System.out.println("리스트 변환 결과" + Mynum);
	}

}
