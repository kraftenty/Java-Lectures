class Car{
	private int speed = 0; //필드
	
	public void upSpeed(int value) { //메소드1
		if(speed + value > 200)
			speed = 200;
		else
			speed += value;
		System.out.println("현재 속도 ==>" + getSpeed());
	}
	
	public void downSpeed(int value) { //메소드2
		if(speed - value < 0)
			speed = 0;
		else
			speed -= value;
		System.out.println("현재 속도 ==>" + getSpeed());
	}
	
	public int getSpeed() { //메소드3
		return speed;
	}
}

public class Car_실습 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
	}

}
