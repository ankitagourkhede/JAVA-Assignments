package Assignments;

import java.util.Scanner;

class Voter{
	int voterId, age;
	String name;
	public Voter(int voterId, String name, int age) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter voterId : ");
		this.voterId = sc.nextInt();
		System.out.println("Enter name : ");
		this.name = sc.next();
		System.out.println("Enter age : ");
		this.age = sc.nextInt();
		sc.close();	
	}
		
}

class AgeException extends Exception{
	public AgeException(String str) {
		System.out.println(str);
	}

}
public class Q59 {

	public static void main(String[] args) {
		Voter v = new Voter(voterId, name, age);
			
			try {
				if(age<18)
					throw new AgeException("invalid age for voter");
				else
					System.out.println("Valid!!!");
				
			} catch (Exception e) {
				System.out.println(e);
			}
		
	}

}
