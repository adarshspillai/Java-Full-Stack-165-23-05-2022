package inheritanceassignment;

public class Dog {  
	private int age; 
	private String color; 
	private String breed; 
	public Dog(int age, String color, String breed) { 
	super(); 
	this.age = age; 
	this.color = color; 
	this.breed = breed; 
	} 
	void bark() { 
	System.out.println("barking...."); 
	} 
	void sleep() { 
	System.out.println("sleeping...."); 
	}  
	public String toString() { 
	return age + " "+breed+" "+color; 
	} 
	public static void main(String[] args) { 
	Dog d1=new Dog(3,"Pug","White"); 
	System.out.println(d1.toString()); 
	d1.bark();
	d1.sleep();
	} 
	} 
