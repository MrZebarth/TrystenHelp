import java.util.*;
public class Stuff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Variable types
		int num1=6;
		double num2=3.4;
		String name;
		//Read in values
		//Read in String: in.nextLine()
		System.out.println("What's your name? ");
		name=in.nextLine();
		
		//Read in integer: in.nextInt()
		System.out.println("How old are you?");
		int age=in.nextInt();
		in.nextLine(); //flush the input stream
		
		//Read in a double: in.nextDouble();
		System.out.println("What is 7/4?");
		num2=in.nextDouble();
		in.nextLine();
		//If statements
		if (num2==7.0/4) {
			System.out.println("You got it!");
		}else {
			System.out.println("Nope! The answer is "+(7.0/4));
		}
		
		//Loops
		
		
		in.close();
	}
}
