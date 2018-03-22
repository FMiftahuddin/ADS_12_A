import java.util.Scanner;

public class cobaSaja
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int bilangan1, bilangan2, hasil;

		System.out.printf("Masukkkan Bilangan Pertama = ");
		bilangan1 = input.nextInt();
		System.out.printf("Masukkkan Bilangan Kedua = ");
		bilangan2 = input.nextInt();

		hasil = bilangan1+bilangan2;

		System.out.printf("Hasil Penjumlahan Adalah = "+hasil);
		
	}
}