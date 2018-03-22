public class arraySatu
{
	public static void main(String[] args)
	{
		int bilangan[] = new int[4]; //membuat array satu dimensi
		int index;

		bilangan[0] = 1;
		bilangan[1] = 2;
		bilangan[2] = 3;
		bilangan[3] = 4;

		for(index = 0; index < 4; index++)
			System.out.printf("%d", bilangan[index]);
	}
}