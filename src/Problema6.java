import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int suma = 0;
		int m = 1;
		for(int i=1;i<=n;i++)
		{
			suma+=m;
			m+=2;
		}
		System.out.println(suma);

	}

}
