import java.util.Scanner;
//problema 1
public class problema {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n<1 || n>10)
			System.out.println("INVALID");
		else
		{
			if(n>=5)
				System.out.println("ADMIS");
			else if(n<5) System.out.println("RESPINS");
		}
	}

}
