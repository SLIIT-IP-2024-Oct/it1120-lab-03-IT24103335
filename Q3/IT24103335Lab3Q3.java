import java.util.Scanner;
	
public class IT24103335Lab3Q3{
	public static void main(String [] args){
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the rupee amount: " );
	int count5000 = scan.nextInt();

	int count5000 = amount / 5000;
	amount = amount % 5000;

	System.out.println("amount " + count5000);

	int count1000 = amount / 1000;
	amount = amount % 1000;

	System.out.println("amount " + count1000);
	
	
}
}