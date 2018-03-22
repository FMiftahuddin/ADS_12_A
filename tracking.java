import java.util.Scanner;

public class tracking
{
	public static void main(String[] args)
	{
		int bil;
		Scanner s = new Scanner(System.in);

		bil = s.nextInt();
		if(bil % 2 == 0);
		bil = bil + 1;
		System.out.printf("%d", bil);
	}
}