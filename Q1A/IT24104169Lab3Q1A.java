import java.util.Scanner;

public class IT24104169Lab3Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter The Price Of 1kg of Rice : ");
		double price = input.nextDouble();
		System.out.print("Please Enter number of kilograms you want to buy : ");
		double count = input.nextDouble();
		double totalAmount = price * count;
		System.out.println("Total Amount : "+totalAmount);
	}
}
		