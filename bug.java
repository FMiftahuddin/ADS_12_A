import java.util.Scanner;
public class bug
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);

		a = s.nextInt();
		b = s.nextInt();

		a = a+b;
		b = b+a;

		System.out.printf("%d %d", a, b);

	}
}