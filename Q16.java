import java.util.Scanner;

public class Q16 {
	
		public static void main(String agrs[]) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("enter num");
			int n = sc.nextInt();
			for (int i=1;i<=10;i++) {
				
				System.out.println(n+" * "+i+" = "+n * i);
			}
			
			
		}
}
