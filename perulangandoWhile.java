import java.util.Scanner;

public class perulangandoWhile //perulangan digunakan sampai syarat terpenuhi
{
	public static void main(String[] args)
	{
		int input;
		Scanner s = new Scanner(System.in);

		input = s.nextInt();

		do
		{
			System.out.printf("%d", input);
			input = input - 1;

		} while(input > 0);

	}
}