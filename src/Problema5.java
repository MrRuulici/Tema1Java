import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int suma = 0;
		int contor = 1;
		int i = 0;
		while(contor <= n)
		{
			i+=2;
			suma = suma+i;
			contor++;
		}
		System.out.println(suma);
	}

}
