import java.util.* ;

public class my2_Collectionlist {

	public static void main(String[] args) {

		ArrayList<String> Mylist = new ArrayList<String>();
		Mylist.add("미고");
		Mylist.add("도이");
		Mylist.add("봉이");
		System.out.println(Mylist); // ArrayList 전체 출력
//		Mylist.add(100);
//		Mylist.add(200);
//		System.out.println(Mylist);
		System.out.println(Mylist.get(1)); // 특정 인덱스의 요소 출력
		System.out.println("저장 사이즈=" + Mylist.size()); // ArrayList의 사이즈 출력
		Mylist.add("슈슈");
		System.out.println(Mylist);
		Mylist.add(2, "제롬");
		System.out.println(Mylist);
		System.out.println("저장 사이즈=" + Mylist.size()); // ArrayList의 사이즈 출력
		Mylist.add("봉이");
		System.out.println(Mylist);
		System.out.println("저장 사이즈=" + Mylist.size()); // ArrayList의 사이즈 출력
		Mylist.remove(0);
		System.out.println(Mylist);
		Mylist.set(2, "길동"); 
		System.out.println(Mylist);
//		for(int i=0;i<Mylist.size();i++)
//			System.out.print(Mylist.get(i) + "/"); 
//		for(String a : Mylist)
//			System.out.print(a + "/"); 
		
		Iterator<String> itrinfo = Mylist.iterator();
		while(itrinfo.hasNext())
			System.out.println(itrinfo.next());
			
	}

}
