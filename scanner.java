import java.util.Scanner;

public class scanner 
{
	public static void main(String[] args)
	{
		Scanner s =  new Scanner(System.in);

		int alas,tinggi,luas;

		System.out.printf("Masukkan Alas : ");
		alas = s.nextInt();

		System.out.printf("Masukkan Bilangan Tinggi : ");
		tinggi = s.nextInt();

		luas = (alas*tinggi)/2;
		System.out.printf("Luas Segitiga Adalah = " +luas);
	}
}