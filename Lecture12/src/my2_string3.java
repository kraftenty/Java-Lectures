
public class my2_string3 {

	public static void main(String[] args) {
		

		String str1="oracle";
		String str2="java";
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		
		String joinresult=sb.toString();
		System.out.println(joinresult);
	}

}
