import java.util.*;

public class ArrayList_test {

	public static void main(String[] args) {

		// ArrayList 선언. 아래는 모두 같은 동작을 한다.
		// ArrayList<Integer> al = new ArrayList<Integer>();
		// ArrayList<Integer> al = new ArrayList<>();
		// List<Integer> al = new ArrayList<>();
		List<Integer> al = new ArrayList<>();
		
		
		// add(요소) : 맨 끝에 요소를 추가
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("add test : " + al);
		
	
		// add(int 위치, 요소) : 지정한 위치(인덱스)에 요소를 추가
		al.add(0,10);
		al.add(4,50);
		System.out.println("add test : " + al);
		
		
		// remove(int 위치) : 지정한 위치(인덱스)의 요소를 삭제. 삭제한 요소를 반환.
		System.out.println("remove test : " + al.remove(4) + ", after remove : " + al);
		
		
		// set(int 위치, 요소) : 지정한 위치의 요소를 변경.
		al.set(1,25);
		System.out.println("set test : " + al);
		
		
		// get(int 위치) : 지정한 위치의 요소를 추출(peek).
		System.out.print("get test : ");
		for(int i=0; i<al.size(); i++)
			System.out.printf("%d ", al.get(i));
		System.out.println();
		
		
		// indexOf(요소) : 찾고자 하는 요소가 들어있는 맨 첫번째 위치를 반환.
		System.out.println("indexOf test : " + al.indexOf(30));
		
		
		// clear() : 모든 요소를 제거.
		al.clear();
		System.out.println("clear test : " + al);
	}

}
