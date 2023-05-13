import java.util.*;

public class my2_Mapsample1 {

	public static void main(String[] args) {
		
		Map<String,Integer> Mymap = new HashMap<>();
		Mymap.put("블루베리", 23500);
		Mymap.put("생크림", 23500);
		Mymap.put("크린베리호두", 23500);
		Mymap.remove("생크림");
		System.out.println("케익목록"+Mymap);
		System.out.println("가격정보"+Mymap.get("크린베리호두"));

	}

}
