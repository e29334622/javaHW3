package p09;

public class p09 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
	}
}

class Car{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+num);//+this.num�]�i�H
		System.out.println("�T�o�q�O"+gas);//+this.gas�]�i�H
	}
}
