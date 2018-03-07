
public class Aclass {
	public static void main(String[] args){
		Car mycar;
		mycar = new Car();
		mycar.setCar("hello", 5, 4);
		mycar.print();
	}
}

class Car{
	String car;
	int speed;
	int gear;
	
	void print(){
		System.out.println(car+"//"+speed+"//"+gear);
	}
	void setCar(String c,int a,int b){
		car = c;
		speed = a;
		gear = b;
	}
}