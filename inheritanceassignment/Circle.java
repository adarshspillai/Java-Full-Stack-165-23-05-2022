package inheritanceassignment;

class Circle1 {
	private double radius = 1.0;
	private String colour = "red";

	public Circle1() {
		radius = 1.0d;
		colour = "red";
	}

	public Circle1(double r) {
		radius = r;
		colour = "red";
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return (radius) * (radius) * Math.PI;
	}
}

 class Circle {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		Circle1 c2=new Circle1(2.0d);
		System.out.println("The circle has radius of " + c.getRadius() + " and area of " + c.getArea());
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		
	}

}
