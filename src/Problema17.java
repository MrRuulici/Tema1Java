import java.util.Scanner;

public class Problema17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max = 1;
		while(n!=0)
		{
			if(max<n%10)
			max = n%10;
			n=n/10;
		}
		System.out.println(max);

	}

}
