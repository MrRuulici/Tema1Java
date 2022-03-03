import java.util.Scanner;
//----------problema 10---------
public class Problema1 {
	
	public static boolean Prim(int nr)
	{
		boolean s = true;
		if(nr%2==0)
			return false;
		for(int j=3; j*j<nr;j++)
		{
			if(nr%j==0)
			{
				s = false;
				break;
			}
		j++;
		}
	return s;
		
	}

	public static void main(String[] args) {
		int nr=1001;
		while(true)
		{
			if(Prim(nr))
			{
				System.out.println(nr);
				break;
			}
			else nr++;
		}
			

	}

}
