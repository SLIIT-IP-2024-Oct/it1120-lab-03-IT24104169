import java.util.Scanner;

public class IT24104169Lab3Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Rupee amount : ");
		int amount = input.nextInt();
		int notes5000 = amount/5000;
		int remainder1 = amount%5000;
		int notes1000 = remainder1/1000;
		int remainder2 = remainder1%1000;
		int notes500 = remainder2/500;
		int remainder3 = remainder2%500;
		int notes100 = remainder3/100;
		int remainder4 = remainder3%100;
		int notes50 = remainder4/50;
		int remainder5 = remainder4%50;
		int notes10 = remainder5/10;
		int remainder6 = remainder5%10;
		int notes5 = remainder6/5;
		int remainder7 = remainder6%5;
		int notes2 = remainder7/2;
		int remainder8 = remainder7%2;
		int notes1 = remainder8/1;
		System.out.println("5000 Notes : "+notes5000+"\n1000 Notes : "+notes1000+"\n500 Notes : "+notes500+"\n100 Notes : "+notes100+"\n50 Notes : "+notes50+"\n10 Coins : "+notes10+"\n5 Coins : "+notes5+"\n2 Coins : "+notes2+"\n1 Coins : "+notes1);
	}
}