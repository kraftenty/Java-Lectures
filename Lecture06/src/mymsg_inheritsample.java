
import java.util.Scanner;

class circle_basic {
	int r;
	double pi = 3.14;
	
	public void circle_width(int a) {
		r = a;
		System.out.println("원의 넓이 = " + (a*a*pi));
	}
}

class circle_outside extends circle_basic {
	public void outside_width() {
		System.out.println("원구의 넓이 = " + (4*pi*(r*r)));
	}
//	public void circle_width(int a) {
//		r=a;
//		System.out.println("원구의 넓이 = " + (4*pi*(r*r)));
//	}
}


public class mymsg_inheritsample {

	public static void main(String[] args) {
		
		int my_val;
		System.out.println("반지름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		my_val = sc.nextInt();
		
		circle_outside my_circle = new circle_outside();
		my_circle.circle_width(my_val);
		my_circle.outside_width();
	}

}
