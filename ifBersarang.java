import java.util.Scanner;

public class ifBersarang
{
	public static void main(String[] args)
	{
		int a;
		Scanner s = new Scanner(System.in);

		System.out.printf("Masukkan Angka Sembarang = ");
		a = s.nextInt();

		if (a > 0)
		{
			System.out.printf(" %d adalah bilangan positif \n", a);
			if (a % 7 == 0)
			{
				System.out.printf(" %d adalah bilangan kelipatan tujuh", a);
			}
			else
			{
				System.out.printf(" %d bukan bilangan kelipatan tujuh", a);
			}
		}
		else if (a == 0)
		{
			System.out.printf(" %d adalah nol", a);
		}
		else
		{
			System.out.printf(" %d adalah bilangan negatif", a);
		}
	}
}
