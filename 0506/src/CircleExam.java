import java.util.Scanner;
public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("반지름 값 >>");
            int radius = scan.nextInt();
		 Circle c = new Circle(radius);
		 System.out.println("반지름 "+ radius + "인 원의 넓이는 " + c.Area() + "이다.");  
	}
}
class Circle{
	int radius;
	public Circle(int radius) { 
		this.radius = radius;
	}
	public double Area() {  
		return radius*radius*3.14;
	}
}