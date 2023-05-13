import java.util.Scanner;

public class mymsg_whilesample {

	public static void main(String[] args) {
		
		//while 문
//		int i = 1, sum = 0;
//		while (i<=50) {
//			sum += i;
//			i++;
//		}
//		System.out.println("합계결과="+sum);
		

		//무한 loop에서 break 예제
//		boolean a = true;
//		int cnt = 1;
//		while(a) {
//			System.out.println(cnt+"회 반복수행");
//			if(cnt==10)
//				break;
//			cnt++;
//		}
//		System.out.println("반복종료");
		
		
		//1부터 1000이 될때까지 계속 더하기
//		int i = 1, sum = 0;
//		while(true) {
//			sum+=i;
//			if(sum>=1000)
//				break;
//			i++;
//		}
//		System.out.println("1000까지 i의 수="+i+" 총합="+sum);
		
		
		//continue 문 
//		int sum = 0;
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//
//			if(num==0) //0이면 종료
//				break;
//			if(num%5!=0) //5의 배수가 아니면 다음 loop를 수행(continue)
//				continue;
//			sum += num; //5의 배수만 합
//		}
//		System.out.println("5의배수 합계="+sum);

		
		//do while의 단점
//		int sum=0, num;
//		do {
//			Scanner sc = new Scanner(System.in);
//			num = sc.nextInt();
//			sum += num;
//		} while(num%5==0);
//		System.out.println("5의 배수 합계 = " + sum);
		
	}

}
