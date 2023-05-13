
public class array_init {

	public static void main(String[] args) {
		
		//배열의 초기화 실습
		//배열의 초기화 : 배열을 정의하는 동시에 값을 대입하는 것.
		
		int aa[] = {100,200,300,400};
		int bb[] = new int[] {100,200,300};
		int cc[];
		cc = new int[] {100,200};
		int[] dd = new int[1];
		dd[0] = 100;
		
		int i;
		for(i=0; i<aa.length; i++)
			System.out.printf("aa[%d]==>%d\t", i, aa[i]);
		System.out.printf("\n");
		for(i=0; i<bb.length; i++)
			System.out.printf("bb[%d]==>%d\t", i, bb[i]);
		System.out.printf("\n");
		for(i=0; i<cc.length; i++)
			System.out.printf("cc[%d]==>%d\t", i, cc[i]);
		System.out.printf("\n");
		for(i=0; i<dd.length; i++)
			System.out.printf("dd[%d]==>%d\t", i, dd[i]);
		System.out.printf("\n");
	}

}
