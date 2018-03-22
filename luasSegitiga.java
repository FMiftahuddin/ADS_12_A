import java.util.Scanner;

public class luasSegitiga 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int alas, tinggi, luas;

		System.out.printf("Alas = ");
		alas = s.nextInt();
		System.out.printf("Tinggi = ");
		tinggi = s.nextInt();

		if (alas > 0 && tinggi > 0)
		{
			luas = (alas*tinggi)/2;
			System.out.printf("Luas Segitiga Adalah = " +luas);
		}
		else
		{
			System.out.printf("Angka yang dimasukkan tidak boleh negatif!!");
		}
	}
}