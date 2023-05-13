
public class mymsg_arraysample {
	
	public static void main(String[] args) {
		
		//배열선언과 사용
		//자바에서 배열은 객체이다. 배열 생성과 동시에 자신의 타입에 맞는 기본값으로 자동초기화됨.
		//선언형식 : 자료형[] 배열식별자 or 자료형 배열식별자[]
//		int[] sample1 = {1,2,3,4,5}; //선언과 동시에 초기화작업
//		int sample2[] = new int[3]; //배열 선언 후 초기화작업 (0으로 초기화)
//		int sample3[] = new int[] {10,20}; //배열 선언 후 초기화작업
//		for(int i : sample1)
//			System.out.println(i);
//		for(int j : sample2)
//			System.out.println(j);
//		for(int k : sample3)
//			System.out.println(k);
		
//		//배열의 자동 초기화
//		int[] coffee;
//		coffee = new int[3]; //자동 초기화(int형: 0)
//		coffee[0]=3000;
//		coffee[1]=3500;
//		for(int i=0; i<coffee.length; i++)
//			System.out.println(coffee[i]);
		
		
		//배열사용
//		int[] coffee = {3500,4000,4500,3800};
//		String[] irum = new String[] {"아메리카노","카페라떼","카라멜라떼","에스프레소"};
//		for(int i=0; i<coffee.length; i++)
//			System.out.println(irum[i] + "가격:" + coffee[i]);

		
		//배열사용
//		String[] coffee; //자동 초기화(string형 : null)
//		coffee = new String[3];
//		coffee[0]="아메리카노";
//		coffee[1]="카페라떼";
//		coffee[2]="카페모카";
//		//for(int i=0;i<coffee.length;i++)
//		for (String i:coffee)
//			System.out.println(i);
	}
}
