import java.util.Scanner;

public class mymsg_forsample {

	public static void main(String[] args) {
		
		//for문으로 합계 구하기
//		int i, sum = 0;
//		for(i=1; i<=50; i++) {
//			sum += i;
//		}
//		System.out.println("계산결과=" + sum);
		
		
		//일반 단순 for문
//		int sum = 0;
//		for(int i=0; i<=10; i++) {
//			sum += i;
//			System.out.println(i + "번째 합계 = " + sum);
//		}
		
		
		//Scanner 메소드 연습
//		Scanner sc = new Scanner(System.in);
//		System.out.print("-128 ~ +127 범위의 정수 입력 : ");
//		System.out.println("nextByte() : " + sc.nextByte());
//		System.out.print("-32768 ~ +32767 범위의 정수 입력 : ");
//		System.out.println("nextShort() : " + sc.nextShort());
//		System.out.print("-21억 ~ +21억 범위의 정수 입력 : ");
//		System.out.println("nextInt() : " + sc.nextInt());
//		System.out.print("-900경 ~ +900경 범위의 정수 입력 : ");
//		System.out.println("nextLong() : " + sc.nextLong());
//		System.out.print("단정도 실수 입력 : ");
//		System.out.println("nextFloat() : " + sc.nextFloat());
//		System.out.print("배정도 실수 입력 : ");
//		System.out.println("nextFloat() : " + sc.nextFloat());
//		System.out.print("단어 한개 입력 : ");
//		System.out.println("next() : " + sc.next());
//		System.out.print("한줄 입력 : ");
//		System.out.println("nextLine() : " + sc.nextLine());
		
		
		//Scanner 클래스를 이용한 for문
//		System.out.println("합계를 계산할 숫자를 입력하세요..");
//		Scanner sc = new Scanner(System.in);
//		int limit_val = sc.nextInt(), sum = 0;
//		sc.close();
//		for(int i=1;i<=limit_val;i++) {
//			sum+=i;
//		}
//		System.out.println("1부터 " + limit_val + " 까지의 합계 = " + sum);


		
		//이중 for문
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++)
//				System.out.printf("%4d",j);
//			System.out.printf("\n");
//		}

		
		//이중 for문
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++)
//				System.out.printf("%4d",j);
//			System.out.printf("\n");
//		}

		
		//이중 for문
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=(6-i); j++)
//				System.out.printf("%4d",j);
//			System.out.printf("\n");
//		}


		//확장 for문
//		int arr[] = {1, 2, 3, 4, 5, 6, 7};
//		int sum = 0;
//		for(int a : arr) { //배열의 요소들을 a가 할당받음
//			sum += a;
//		}
//		System.out.printf("%5d", sum);

		
	}

}
