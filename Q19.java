import java.util.Scanner;
class Q19{
	
public static void main(String args[]) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 'n' : ");
        int n = sc.nextInt();
        int sum = (n * (n + 1) * (2 * n + 1 )) / 6;
       System.out.println(sum);

    }
}