import java.util.Scanner;

public class perulanganWhile //perulangan digunakan sampai syarat terpenuhi
{
	public static void main(String[] args)
	{
		int input;
		Scanner s = new Scanner(System.in);

		input = s.nextInt();

		while(input > 0)
		{
			input = s.nextInt();
		}

	}
}