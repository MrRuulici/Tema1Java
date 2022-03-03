import java.util.Scanner;

public class Problema16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n>=10)
		{
			System.out.println(n%10);
			n=n/10;
		}
		System.out.println(n);

	}

}
