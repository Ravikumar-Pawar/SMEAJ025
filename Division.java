import java.util.Scanner;
public class Division{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the dividend:");
		int dividend=s.nextInt();
		System.out.println("Enter the divisor:");
		int divisor=s.nextInt();
		System.out.println(dividend/divisor);
		s.close();
	}
}