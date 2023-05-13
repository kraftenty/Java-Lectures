import java.util.Scanner;

public class prac_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("합계의 시작값 ==> ");
		int start = sc.nextInt();
		System.out.print("합계의 끝값 ==> ");
		int end = sc.nextInt();
		System.out.print("배수 ==> ");
		int mul = sc.nextInt();
		
		int sum=0,i=start;
		while(i<=end) {
			if(i%mul==0)
				sum+=i;
			i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n",start, end, mul, sum);
		sc.close();
	}

}
