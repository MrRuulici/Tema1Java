import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		if(n%2==0 && m%2==0)
			System.out.println((n+m)/2);
		else if(n%2!=0 && m%2!=0)
			System.out.println(n*m);
		else if((n%2==0 && m%2!=0) || (n%2!=0 && m%2==0))
			System.out.println(n+m);
	}

}
