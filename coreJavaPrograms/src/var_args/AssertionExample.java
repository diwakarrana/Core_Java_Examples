package var_args;

import java.util.Scanner;
// how to run assertion in eclipse....
public class AssertionExample {

	public static void main(String[] args) {
		
		System.out.println("enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		assert age >= 18 : "not valid";
		
		System.out.println("age is "+age);

	}

}
