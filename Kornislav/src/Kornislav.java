import java.util.Scanner;
public class Kornislav
{

	public static void main(String[] args)
	{
		int a1, a2, a3, a4, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value 1 : ");
		a1 = scan.nextInt();
		System.out.print("Input Value 2 : ");
		a2 = scan.nextInt();
		System.out.print("Input Value 3 : ");
		a3 = scan.nextInt();
		System.out.print("Input Value 4 : ");
		a4 = scan.nextInt();

		if(a1 > a2)
		{
			temp = a1;
			a1 = a2;
			a2 = temp;
		}
		if(a1 > a3)
		{
			temp = a1;
			a1 = a3;
			a3 = temp;
		}
		if(a1 > a4)
		{
			temp = a1;
			a1 = a4;
			a4 = temp;
		}
		if(a2 > a3)
		{
			temp = a2;
			a2 = a3;
			a3 = temp;
		}
		if(a2 > a4)
		{
			temp = a2;
			a2 = a4;
			a4 = temp;
		}
		if(a3 > a4)
		{
			temp = a3;
			a3 = a4;
			a4 = temp;
		}
		System.out.print("\nRectangle Area = : " + "" + a3 + "" + " * "+ a1 + " = " + a3 * a1);

	}

}
