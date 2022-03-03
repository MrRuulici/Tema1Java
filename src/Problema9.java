import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ok=1;
		for(int i=2;i*i<=n&&ok==1;i++)
		{
			if(n%i==0) ok=0;
		}
		if(ok==1)
			System.out.println("Este numar prim");
		else System.out.println("Nu este numar prim");
	}
	
}
