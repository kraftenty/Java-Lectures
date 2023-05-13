import java.text.SimpleDateFormat;
import java.util.*;

public class my2_date5 {

	public static void main(String[] args) {
		
		try {
			//문자열을 날짜로 변경
			System.out.println("당신의 입사일자를 입력하세요(yyyy-MM-dd)\n");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date d = df.parse(a);
			System.out.println("당신의 입사일자(문자열-->날짜) ===> "+ d);
			
			//날짜를 문자열로 변경
			String result;
			SimpleDateFormat dfresult = new SimpleDateFormat("yy-MM-dd");
			result = dfresult.format(d);
			System.out.println("당신의 입사일자(날짜-->문자열) ===>"+result);
			
			
		}
		
		catch(java.text.ParseException ex){
			ex.printStackTrace();
		}

	}

}
