import java.util.Scanner;
public class Q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double radius = sc.nextDouble();
		double area = Math.PI*(radius * radius);
		System.out.println("area of circle is" +area);
		double circumference = Math.PI*2*radius;
		System.out.println("area of circle is" +circumference);
			
		
		
	}

}
