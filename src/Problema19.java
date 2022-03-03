import java.util.Scanner;

public class Problema19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n!=0)
		{
			System.out.print(n%10);
			n/=10;
		}

	}

}
