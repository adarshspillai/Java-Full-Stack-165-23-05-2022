package polymorphismassignment;
public class Ball { 
private double x = 0.0; 
private double y = 0.0; 
public Ball() { 
super(); 
} 
public Ball(double x, double y) { 
super(); 
this.x = x; 
this.y = y; 
} 
public double getX() { 
return x; 
} 
public void setX(double x) { 
this.x = x; 
} 
public double getY() { 
return y; 
}
public void setY(double y) { 
this.y = y; 
} 
public void setXY(double x, double y) { 
this.x = x; 
this.y = y; 
} 
public void move(double xDisp, double yDisp) 
{ 
x+=xDisp; 
y+=xDisp; 
System.out.println(x+ " "+y); 
} 
public void setXYSpeed(double xSpeed, double ySpeed) { 
x=xSpeed; 
y=ySpeed; 
System.out.println(x+" "+y); 
} 
public String toString() { 
return "Ball [x=" + x + ", y=" + y + "]"; 
} 
public static void main(String[] args) { 
Ball b1=new Ball(4, 2); 
b1.move(5, 1); 
b1.setXYSpeed(12, 10); 
System.out.println(b1.toString()); 
} 
}
