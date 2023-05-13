import java.util.*;

public class my2_Mapsample2 {

public static void main(String[] args) {
		
		Map<String,Integer> Mymap = new HashMap<>();
		Mymap.put("블루베리", 23500);
		Mymap.put("생크림", 23500);
		Mymap.put("크린베리호두", 23500);
		Mymap.put("요거트호두", 18500);
		Mymap.put("치즈케익", 22000);
		System.out.println("키값="+Mymap.keySet());
		//System.out.println("전체값="+Mymap.entrySet());
		
//		int i=0;
//		for(String k : Mymap.keySet()) {
//			i++;
//			System.out.println(i+"번 상품의 가격정보="+Mymap.get(k));
//		}
		
		Iterator<String> itrinfo = Mymap.keySet().iterator();
		while(itrinfo.hasNext()) {
			String k = itrinfo.next();
			System.out.println("케익명="+k+"  가격="+Mymap.get(k));
		}
			
		
		
	}
}
