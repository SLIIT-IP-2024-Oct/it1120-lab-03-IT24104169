import java.util.Scanner;

public class IT24104169Lab3Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice : ");
		double price = input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy : ");
		double count = input.nextDouble();
		double totalAmount = price * count;
		double discount = totalAmount * 0.1;
		double totalAmountAfterDiscount = totalAmount - discount;
		System.out.println("The total amount with 10% discount is : "+totalAmountAfterDiscount);
	}
}
		