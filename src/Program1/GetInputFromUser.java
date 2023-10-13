package Program1;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("hello "+name);

	}

}
