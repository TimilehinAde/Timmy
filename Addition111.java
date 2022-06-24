import java.util.Scanner; 
public class Addition111{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer : ");
	int Number1 = input.nextInt();

	System.out.println("Enter second integer : ");
	int number2 = input.nextInt();

	int sum = number1 + number2 ;

	System.out.printf("Sum is %d%n", sum) ;
}

}