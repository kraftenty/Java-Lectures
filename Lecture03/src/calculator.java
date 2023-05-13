import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		System.out.printf("첫번째 수를 입력하세요 : ");
		a=s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		ch=s.next().charAt(0); //한개의 문자가 들어온다 해도 뒤에 null이 붙기 때문에 맨 처음 문자만을 사용한다.
		System.out.printf("두번째 수를 입력하세요 : ");
		b=s.nextInt();
		
		if(ch=='+')
			System.out.printf("%d + %d = %d\n",a, b, a+b);
		else if(ch=='-')
			System.out.printf("%d - %d = %d\n",a, b, a-b);
		else if(ch=='*')
			System.out.printf("%d * %d = %d\n",a, b, a*b);
		else if(ch=='/')
			if(b==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d / %d = %f\n",a, b, (float)a/b);
		else if(ch=='%')
			if(b==0)
				System.out.println("0으로 나눈 나머지값을 얻을 수 없습니다");
			else
				System.out.printf("%d %% %d = %d\n",a, b, a%b);
		else
			System.out.println("잘못된 연산자 입니다");
		s.close();
	}
}
