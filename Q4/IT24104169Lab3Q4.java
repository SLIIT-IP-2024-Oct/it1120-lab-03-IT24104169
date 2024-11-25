import java.util.Scanner;

public class IT24104169Lab3Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Any 5 Digits Number : ");
		int userInput = input.nextInt();
		int number1 = userInput/10000;
		int number2 = (userInput/1000) %10;
		int number3 = (userInput/100) %10;
		int number4 = (userInput/10) %10;
		int number5 = userInput % 10;
		System.out.println("Output : " + number1 +" "+number2+" "+number3+" "+number4+" "+number5);
	}
}	