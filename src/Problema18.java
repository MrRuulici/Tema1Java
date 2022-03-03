import java.util.Scanner;

public class Problema18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int min = n%10;
		while(n!=0)
		{
			if(min>n%10)
			min = n%10;
			n=n/10;
		}
		System.out.println(min);


	}

}
