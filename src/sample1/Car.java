package sample1;

public class Car {

	private String number;
	private int enter;
	private int exit;
	
	private final int PAID = 2000;
	
	
	public Car(String number, int enter, int exit) {
		this.number = number;
		this.enter = enter;
		this.exit = exit;
	}



	public void prn() {
		System.out.println("차량번호:" + number);
		System.out.println("입고시간:" + enter + "시");
		System.out.println("출고시간:" + exit + "시");
		System.out.println("주차요금:" + (exit-enter) * PAID);
	}
}








