package inheritanceassignment;

 class Car {
	String model="swift";
	int price=200000;
	void start() {
		System.out.println("start the car");
	}
	void stop() {
		System.out.println("stop the car");
	}
	void move() {
		System.out.println("move the car");
	}
}
class Driver extends Car{
	int age=22;
	String name="Alan";
	void drive() {
		System.out.println("drive the car");
	}
}
class Car1{


	public static void main(String[] args) {
		Car c=new Car();
		Driver d=new Driver();
		c.start();
		c.stop();
		c.move();
		System.out.println(c.model);
		System.out.println(c.price);
		d.drive();
		System.out.println(d.name);
		System.out.println(d.age);
	
	
		

	}

}

