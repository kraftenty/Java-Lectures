import java.math.BigDecimal; //BigDecimal class를 사용할 수 있도록 함.
import java.math.RoundingMode; //RoundingMode class를 사용할 수 있도록 함.

public class mymsg_opsample {

	public static void main(String[] args) {
		
		//증가,감소 산술연산자
//		int a=5, b=7;
//		System.out.println("계산결과1=" + (++a)); //5에 1을 더하여 출력
//		System.out.println("계산결과2=" + (a++)); //a값 출력 후 1을 더하여 a에 저장
//		System.out.println("계산결과3=" + (--b)); //7에서 1을 뺀 후 출력
//		System.out.println("계산결과4=" + (a+b--)); //현재 a값과 b값을 먼저 더하여 출력 후 b값 1감소
		
		//할당 산술연산자
//		int a=5, b=3, c=10;
//		System.out.println("결과1="+(a+=5)); //a=a+5
//		System.out.println("결과2="+(b*=2)); //b=b*2
//		System.out.println("결과3="+(c%=3)); //c=c%3
		
		//실수의 정확한 연산을 위해 BigDecimal class 이용
//		BigDecimal big_calc1 = new BigDecimal("0.8");
//		BigDecimal big_calc2 = new BigDecimal("0.9");
//		BigDecimal bigsum = big_calc1.add(big_calc2);
//		System.out.println("결과="+bigsum);
		
		//실수의 정확한 연산을 위해 Roundingmode class 이용
		BigDecimal big_calc1 = new BigDecimal("55.5");
		BigDecimal big_calc2 = new BigDecimal("3.4");
		big_calc1 = big_calc1.divide(big_calc2, 1, RoundingMode.DOWN); //피제수, 소수점 몇째자리까지, RoundingMode
		System.out.println("결과=" + big_calc1);
	}

}
