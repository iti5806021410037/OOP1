import java.util.Scanner;
public class Seven_Midgets
{

	public static void main(String[] args)
	{
		int m1, m2, m3, m4, m5, m6, m7, m8, m9;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Midget 1 : ");
		m1 = scan.nextInt();
		System.out.print("Enter Midget 2 : ");
		m2 = scan.nextInt();
		System.out.print("Enter Midget 3 : ");
		m3 = scan.nextInt();
		System.out.print("Enter Midget 4 : ");
		m4 = scan.nextInt();
		System.out.print("Enter Midget 5 : ");
		m5 = scan.nextInt();
		System.out.print("Enter Midget 6 : ");
		m6 = scan.nextInt();
		System.out.print("Enter Midget 7 : ");
		m7 = scan.nextInt();
		System.out.print("Enter Midget 8 : ");
		m8 = scan.nextInt();
		System.out.print("Enter Midget 9 : ");
		m9 = scan.nextInt();
		System.out.println();
		
		if(m3 + m4 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 2");
		if(m2 + m4 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 3");
		if(m3 + m2 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 4");
		if(m3 + m4 + m2 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 5");
		if(m3 + m4 + m5 + m2 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 6");
		if(m3 + m4 + m5 + m6 + m2 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 7");
		if(m3 + m4 + m5 + m6 + m7 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 8");
		if(m3 + m4 + m5 + m6 + m7 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 1 & Midget 9");
		if(m1 + m4 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 3");
		if(m3 + m1 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 4");
		if(m3 + m4 + m1 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 5");
		if(m3 + m4 + m5 + m1 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 6");
		if(m3 + m4 + m5 + m6 + m1 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 7");
		if(m3 + m4 + m5 + m6 + m7 + m1 + m9 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 8");
		if(m3 + m4 + m5 + m6 + m7 + m8 + m1 == 100)
			System.out.print("Fake Midget is Midget 2 & Midget 9");
		if(m1 + m2 + m5 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 4");
		if(m1 + m4 + m2 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 5");
		if(m1 + m4 + m5 + m2 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 6");
		if(m1 + m4+ m5 + m6 + m2 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 7");
		if(m1 + m4 + m5 + m6 + m7 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 8");
		if(m1 + m4 + m5 + m6 + m7 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 3 & Midget 9");
		if(m3 + m1 + m2 + m6 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 4 & Midget 5");
		if(m3 + m1 + m5 + m2 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 4 & Midget 6");
		if(m3 + m1 + m5 + m6 + m2 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 4 & Midget 7");
		if(m3 + m1 + m5 + m6 + m7 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 4 & Midget 8");
		if(m3 + m1 + m5 + m6 + m7 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 4 & Midget 9");
		if(m3 + m4 + m1 + m2 + m7 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 5 & Midget 6");
		if(m3 + m4 + m1 + m6 + m2 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 5 & Midget 7");
		if(m3 + m4 + m1 + m6 + m7 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 5 & Midget 8");
		if(m3 + m4 + m1 + m6 + m7 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 5 & Midget 9");
		if(m3 + m4 + m5 + m1 + m2 + m8 + m9 == 100)
			System.out.print("Fake Midget is Midget 6 & Midget 7");
		if(m3 + m4 + m5 + m1 + m7 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 6 & Midget 8");
		if(m3 + m4 + m5 + m1 + m7 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 6 & Midget 9");
		if(m3 + m4 + m5 + m6 + m1 + m2 + m9 == 100)
			System.out.print("Fake Midget is Midget 7 & Midget 8");
		if(m3 + m4 + m5 + m6 + m1 + m8 + m2 == 100)
			System.out.print("Fake Midget is Midget 7 & Midget 9");
		if(m3 + m4 + m5 + m6 + m7 + m1 + m2 == 100)
			System.out.print("Fake Midget is Midget 8 & Midget 9");
	}

}
